package com.siva.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.entity.BankEntity;
import com.siva.model.BankModel;
import com.siva.repo.BankRepo;
@Service
public class SdfcBankService implements BankService {
@Autowired
private BankRepo repo;

	@Override
	public BankEntity saveBankEntity(BankEntity bank) {
		
		String pass=bank.getPassword();

		String sts="active";
		bank.setPassword(pass);
		bank.setStatus(sts);
		
		
		return repo.save(bank);
	}

	@Override
	public BankEntity getBankEntity(int  account_number,String name,String password) {
	
	BankEntity b=repo.findById(account_number).get();
	b.getAmount();

	if(name.equals(b.getName())&&password.equals(b.getPassword())&&b!=null) {
	
	return b;}else
		return null;
	
	}

	@Override
	public BankEntity updateBankEntity(BankEntity bank, int account_number,String name,String password,double amount) {
		BankEntity db=repo.findById(account_number).get();
		
		double deposit=db.getAmount()+amount;
		if(name.equals(db.getName())&&password.equals(db.getPassword())&&db!=null) {
	
			db.setAmount(deposit);
			return repo.save(db);}
	else 
		return null;
	}
	@Override
	public BankEntity withdrawBankEntity(BankEntity bank, int account_number,String name,String password,double amount) {
		BankEntity db=repo.findById(account_number).get();
		double before=db.getAmount();
		double withdraw=db.getAmount()-amount;
		if(name.equals(db.getName())&&password.equals(db.getPassword())&&before>=amount&&db!=null) {
	
			db.setAmount(withdraw);
			return repo.save(db);}
	else 
		return null;
	}

	@Override
	public BankEntity deleteBankEntity(BankEntity bank,int account_number) {
		BankEntity db=repo.findById(account_number).get();
		if(account_number==(db.getAccount_number())) {
		
	String active=db.getStatus();
	active="inactive";
	db.setStatus(active);
	return repo.save(db);
	}
		else
	{
		return null;
	}
	}

@Override
	public BankEntity  transferBankEntity(BankEntity bank,int account_number,String name,String password,int targetacno,double amount)
{
	
	
		BankEntity sender=repo.findById(account_number).get();
		
	double senderamount=sender.getAmount()-amount;
		sender.setAmount(senderamount);
		BankEntity send= repo.save(sender);
		
		BankEntity reciver=repo.findById(targetacno).get();
		double reciveramount =reciver.getAmount()+amount;
		reciver.setAmount(reciveramount);
	
		return repo.save(reciver);

	
}
}

		
		
	
	
