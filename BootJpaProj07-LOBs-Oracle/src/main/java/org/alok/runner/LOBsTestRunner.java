package org.alok.runner;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Optional;
import java.util.Scanner;

import org.alok.entity.JobSeeker;
import org.alok.service.IJobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Component;
@Component
public class LOBsTestRunner implements CommandLineRunner {

	@Autowired
	private IJobSeekerService service;
	
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		/*System.out.print("ENter id:: ");
		Integer id =Integer.parseInt(sc.next())  ;
		sc.nextLine();
		
		System.out.print("Enter Job Seeker Name:: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Job Seeker Addr:: ");
		String addr = sc.nextLine();
		
		System.out.print("is Indian:: ");
		boolean isIndian =Boolean.parseBoolean(sc.nextLine());
		
		System.out.print("Enter the Photo Path:: ");
		String photoPath = sc.nextLine();
		
		System.out.print("Enter the Resume Path:: ");
		String resumePath = sc.nextLine();
		
		//create byte[] by locating the file in the file system
		File file = new File(photoPath);
		FileInputStream fis = new FileInputStream(file);
		byte[] photoContent = new byte[fis.available()];
		photoContent = fis.readAllBytes();
		//cerate char[] by locating the file in file system
		 file= new File(resumePath);
		 FileReader reader = new FileReader(file);
		 char[] resumeContent= new char[(int)file.length()];
		 reader.read(resumeContent);
		 
		 
		 //create entity class object
		 JobSeeker seeker = new JobSeeker(id,name,addr,isIndian,photoContent,resumeContent);
		try
		{
			 System.out.println(service.registerJobbSeeker(seeker));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		*/
		
		System.out.print("Enter Your Id:: ");
		Optional<JobSeeker> opt = service.fetchById(sc.nextInt());
		if(opt.isPresent())
		 {
			JobSeeker job = opt.get();
			System.out.println("JObID:: "+job.getJobId());
			System.out.println("SeekerName:: "+job.getName());
			System.out.println("Address:: "+job.getAddr());
			System.out.println("IsIndian:: "+job.isIndian());
			
			
			//read photo content from entity Object and write to file
			byte[] photoContent = job.getPhotos();
			try(FileOutputStream fos = new FileOutputStream("photo_retrive.jpeg"))
			{
				fos.write(photoContent);
				fos.flush();
				System.out.println("Photo retrived from db");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			//read resume content from entity Object and write to file
			char [] resumeContent = job.getResume();
			try(FileWriter writer = new FileWriter("resume_content.txt"))
			{
				writer.write(resumeContent);
				writer.flush();
				System.out.println("REsume retrived from db");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		 }
		else
		 {
			System.out.println("Result Not Found......");
		 }
		
		
		
		
		}

}
