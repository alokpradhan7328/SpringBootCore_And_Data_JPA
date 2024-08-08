package org.alok.runner;

import java.util.Scanner;

import org.alok.entity.ApnaBank;
import org.alok.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class VersioningAndTimeStrapingTest implements CommandLineRunner {

	@Autowired
	private IBankService bankService;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		/*ApnaBank bank = new ApnaBank();
		bank.setHolderName("Alok"); bank.setAddrs("Berhampur");bank.setBalance(10000.00); 
		System.out.println(bankService.addCustomer(bank));*/
		
		/*try(sc;)
		{
			System.out.print("Enter accNo:: ");
			Integer accNo= sc.nextInt();
			String msg = bankService.withDrwal(accNo, 5000.0);
			System.out.println(msg);
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}*/
		
		try(sc)
		{
			System.out.print("Enter accNo:: ");
			Integer accNo = sc.nextInt();
			System.out.println(bankService.deposit(accNo, 2000D));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
