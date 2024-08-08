package org.alok.service;


import java.util.Optional;

import org.alok.entity.ApnaBank;
import org.alok.repository.IBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BankServiceImpl implements IBankService {

	@Autowired
	private IBankRepository bankRepo;
	
	@Override
	public String addCustomer(ApnaBank bank) {
		 Integer accNo = bankRepo.save(bank).getBankAccNo();
		return "Account Created having accNo "+accNo;
	}
	
	@Override
	public String withDrwal(Integer accNo, Double amount) {
		Optional<ApnaBank> opt = bankRepo.findById(accNo);
		if(opt.isPresent())
		{
			ApnaBank bank = opt.get();
			bank.setBalance(bank.getBalance()-amount);
			return amount+" rupees dbited from your account";
		}
		return "Accout is n't available create account";
	}
	
	@Override
	public String deposit(Integer accNo, Double amount) {
		//load into Optional object
		Optional<ApnaBank> opt = bankRepo.findById(accNo);
		if(opt.isPresent())
		{
			//get the real object
			ApnaBank bank = opt.get();
			bank.setBalance(amount+bank.getBalance());
			return accNo+" account will be credited having amount is "+amount;
		}
		return "Acccount couldn't find out";
	}
	
	
}
