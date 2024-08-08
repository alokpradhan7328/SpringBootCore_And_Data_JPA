package org.alok.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("clg")
@Setter
@ToString
@ConfigurationProperties(prefix="college")
public class College 
{
	private String name;
	private String addr;
	@Value("${college.pincode}")
	private Integer pin;
	private Long contact;
	
	private String[] students;
	private Set<Integer> rollNo;
	private List<String> dept;
	
	private Map<String,Object> sem;
	
	
}
