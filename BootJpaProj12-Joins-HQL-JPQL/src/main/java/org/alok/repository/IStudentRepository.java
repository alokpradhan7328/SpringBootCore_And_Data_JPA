package org.alok.repository;

import java.util.List;

import org.alok.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IStudentRepository extends JpaRepository<Student,Integer> {
	@Query("SELECT S.id,S.sname,S.city,S.dept,S.gender,S.marks,C.cid,C.cname,C.addrs,C.contactNo,C.fees FROM Student S FULL JOIN S.college C")
	public List<Object[]> fetchDataUsingChild();
}
