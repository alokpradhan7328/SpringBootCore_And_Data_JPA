package org.alok.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix="org.alok")
@Data
@Component("emp")
public class Employee 
{
	//for simple properties
	private Integer eno;
	private String ename;
	
	//for array
	private String[] favBike;
	
	//for collection
	private Set<Long> contactNo;
	private List<String> nickNames;
	
	private Map<String,Object> eid;
	
	//HAS A 
	private Company company;
	
	
}
