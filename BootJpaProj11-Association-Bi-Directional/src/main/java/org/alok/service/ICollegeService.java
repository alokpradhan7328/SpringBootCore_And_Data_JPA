package org.alok.service;


public interface ICollegeService {
	public void saveDataUsingParent();
	public void saveDataUsingChild();
	
	public void loadDataUsingParent();
	public void loadDataUsingChild();
	
	public String deleteById(Integer id);
	public String deleteAllStudentsOfACollege(Integer cid);
	
	public void addingNewChildToAParentById(Integer id);
}
