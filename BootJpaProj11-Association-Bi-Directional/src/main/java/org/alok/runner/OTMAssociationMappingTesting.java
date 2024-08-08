package org.alok.runner;

import org.alok.service.ICollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OTMAssociationMappingTesting implements CommandLineRunner {

	@Autowired
	private ICollegeService collegeService;
	
	@Override
	public void run(String... args) throws Exception {
		/*try
		{
			collegeService.saveDataUsingParent();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*try
		{
			collegeService.saveDataUsingChild();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		//collegeService.loadDataUsingParent();
		//collegeService.loadDataUsingChild();
		
		//System.out.println(collegeService.deleteById(102));
		//System.out.println(collegeService.deleteAllStudentsOfACollege(100));
		collegeService.addingNewChildToAParentById(104);

	}

}
