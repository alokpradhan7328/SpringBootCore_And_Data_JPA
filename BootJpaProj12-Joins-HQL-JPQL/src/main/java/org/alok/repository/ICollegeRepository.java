package org.alok.repository;

import java.util.List;

import org.alok.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICollegeRepository extends JpaRepository<College, Integer> {
//@Query("SELECT C.cid,C.cname,C.addrs,C.contactNo,C.fees,S.id,S.sname,S.city,S.dept,S.gender,S.marks FROM College C INNER JOIN C.studentDetails S")

@Query("SELECT C.cid,C.cname,C.addrs,C.contactNo,C.fees,S.id,S.sname,S.city,S.dept,S.gender,S.marks FROM College C FULL JOIN C.studentDetails S")
	public List<Object[]> fetchDataUsingParent();
	
	
}
