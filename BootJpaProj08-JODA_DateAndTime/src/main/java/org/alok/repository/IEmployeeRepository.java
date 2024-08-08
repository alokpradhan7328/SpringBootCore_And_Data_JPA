package org.alok.repository;

import java.util.List;

import org.alok.entity.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEmployeeRepository extends JpaRepository<EmployeeInfo, Integer> {
	
	@Query(value="SELECT EID, ENAME, ADDR, DESG, DOB, TOJ, DOJ FROM JPA_EMPLOYEE_INFO WHERE DESG = :desg", nativeQuery = true)
	public List<EmployeeInfo> getEmlployeeByDesg(String desg);
	
	@Query(value="SELECT DATE_FORMAT(FROM_DAYS(DATEDIFF(NOW(), DOB)), '%Y') + 0 AS age FROM JPA_EMPLOYEE_INFO WHERE EID = :eid", nativeQuery = true)
	public float getEmployeeByID(Integer id);
}
