package org.alok.sbeans;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("scheduling")
public class RepoortGeneratorService 
{

	/*@Scheduled(fixedDelay = 3000)
	public void reportGenerator()
	{
		System.out.println("RepoortGeneratorService:: report Generated on==>"+new Date());
	}*/
	
	/*@Scheduled(initialDelay = 4000,fixedDelay = 3000)
	public void reportGenerator()
	{
		System.out.println("Sales Report start on:: "+new Date()+"Start()");
		try
		{
			Thread.sleep(7000); //To complete task it will take 7sec time 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Sales Report end on :: "+new Date()+"END");
		
	}*/
		
	
	/*@Scheduled(fixedRate = 10000)
	public void reportGenerator()
	{
		System.out.println("Sales Report start on:: "+new Date()+"Start()");
		try
		{
			Thread.sleep(7000); //To complete task it will take 7sec time 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Sales Report end on :: "+new Date()+"END");
		
	}*/
	
	
	/*@Scheduled(initialDelay =10000,fixedRate = 5000)
	public void reportGenerator()
	{
		System.out.println("Sales Report start on:: "+new Date()+"Start()");
		try
		{
			Thread.sleep(3000); //To complete task it will take 7sec time 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Sales Report end on :: "+new Date()+"END");
	}*/
	
	/*@Scheduled(fixedDelay = 3000)
	public void reportGenerator()
	{
		System.out.println("Report Generated:: "+new Date()+" Thread Name:: "+Thread.currentThread().getName());
		System.out.println("Report Ended:: "+new Date()+" End");
	}*/
	
	//===========cron=============
	
	/*@Scheduled(cron="20 * * * * *")
	public void reportGenerator()
	{
		System.out.println("report Generated:: "+new Date()+"....");
		System.out.println("--------------"+new Date());
	}*/
	
	@Scheduled(cron="0 43 * * * *")
	public void showReport()
	{
		System.out.println("report Generated:: "+new Date()+"....");
		System.out.println("--------------"+new Date());
	}
}
