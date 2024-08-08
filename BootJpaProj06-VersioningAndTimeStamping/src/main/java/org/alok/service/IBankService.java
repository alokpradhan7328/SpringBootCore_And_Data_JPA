package org.alok.service;

import org.alok.entity.ApnaBank;

public interface IBankService {
	public String addCustomer(ApnaBank bank);
	public String withDrwal(Integer accNo,Double amount);
	public String deposit(Integer accNo,Double amount);
}
