package com.siva.service;

import com.siva.entity.BankEntity;

public interface BankService {

	public BankEntity saveBankEntity(BankEntity bank);
	public  BankEntity getBankEntity(int account_number,String name,String password);
	public BankEntity updateBankEntity(BankEntity bank,int account_numbera,String name,String password,double amount);
	public BankEntity withdrawBankEntity(BankEntity bank,int account_numbera,String name,String password,double amount);
	public BankEntity deleteBankEntity(BankEntity bank, int account_number);

	public BankEntity  transferBankEntity(BankEntity bank,int account_number,String name,String password,int targetacno,double amount);
	
}

