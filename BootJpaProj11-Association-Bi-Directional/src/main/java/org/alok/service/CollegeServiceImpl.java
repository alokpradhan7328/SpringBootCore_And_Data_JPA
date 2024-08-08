package org.alok.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.alok.entity.College;
import org.alok.entity.Student;
import org.alok.repository.ICollegeRepository;
import org.alok.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl  implements ICollegeService 
{
	@Autowired
	private ICollegeRepository collegeRepo;
	
	@Autowired
	private IStudentRepository studentRepo;
	
	@Override
	public void saveDataUsingParent() 
	{
		//create college obj
		College college = new College("Presidency College","Berhampur",75000D,68123456l);
		//create  student obj
		Student s1 = new Student("Alok", "Male", "Bam", "CSE",76.87f);
		Student s2 = new Student("Deepak", "Male", "Delhi", "EEE",80.87f);
		Student s3 = new Student("Dipti", "Female", "Hyd", "CIVIL",90.87f);
		
		//add parent to child
		s1.setCollege(college);s2.setCollege(college);
		s3.setCollege(college);
		//add child to parent
		college.setStudentDetails(Set.of(s1,s2,s3));
		//save the  parent object
		collegeRepo.save(college);
		System.out.println("College and his associated Student records are saved(P-C)");	
	}
	
	@Override
	public void saveDataUsingChild() {
		//create College object
		College college = new College("RIT", "SURYA BIHAR", 45000.0, 67867577l);
		//create Student object
		Student s1 = new Student("Rohan", "Male", "IPM", "MBA",83.12f);
		Student s2 = new Student("Aparna", "Female", "BBS", "MCA",63.56f);
		Student s3 = new Student("Gyana", "Female", "SEC", "MSC",95.23f);
		//add child to parent
		college.setStudentDetails(Set.of(s1,s2,s3));
		//add parent to child
		s1.setCollege(college);s2.setCollege(college);s3.setCollege(college);
		//save the child object
		studentRepo.save(s1);
		studentRepo.save(s2);
		studentRepo.save(s3);
		System.out.println("Student & his associated  records are saved (C-P)");
	}
	
@Override
	public void loadDataUsingParent() {
		// get parent object
	 List<College> list = collegeRepo.findAll();
	 list.forEach(clg ->
	 {
		 System.out.println("College:: "+clg);
		 //get std obj record 
			/*Set<Student> std = clg.getStudentDetails();
			System.out.println("Size:: "+std.size());
			std.forEach(s ->{
			 System.out.println("Students:: "+s);
			});*/
	 });
		
	}

	@Override
	public void loadDataUsingChild() 
	{
		// loads child obj
		List<Student> students = studentRepo.findAll();
		students.forEach(student ->{
			System.out.println("StudentInfo:: "+student);
			/*//get college info
			College college = student.getCollege();
			System.out.println("CollegeInfo:: "+college);*/
		});
		
	}
	
	
	@Override
	public String deleteById(Integer cid) 
	{
		//loads parent obj
		 Optional<College> opt =collegeRepo.findById(cid);
		 if(opt.isPresent())
		 {
			 collegeRepo.delete(opt.get());
			 return "College and his associated records will be deleted";
		 }
		return "No Record not found";
	}
	
	
	@Override
	public String deleteAllStudentsOfACollege(Integer cid) {
		// loads parent obj
		Optional<College> opt = collegeRepo.findById(cid);
		
		if(opt.isPresent())
		{
			Set<Student> students = opt.get().getStudentDetails();
			students.forEach(std ->{
				std.setCollege(null);
			});
			collegeRepo.deleteAll();
			return students.size()+" Students records are deleted";
		}
		return "College not found";
	}
	
	@Override
	public void addingNewChildToAParentById(Integer id) {
		// loads parent object
	Optional<College> opt =	 collegeRepo.findById(id);
		if(opt.isPresent())
		{
			//get parent object
			College clg = opt.get();
			//get child obj
			Set<Student> students = clg.getStudentDetails();
			//create new child obj
		Student std= new Student("Chutki", "Female", "Surat", "ME", 78);
		//loads child to parent
		std.setCollege(clg);
		students.add(std);
		collegeRepo.save(clg);
		System.out.println("New Student records inserted into "+id);
		}
		else
		{
			System.out.println(id+" College not found");
		}
	}
}
