package com.siva.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.siva.entity.BankEntity;
import com.siva.model.BankModel;
import com.siva.service.BankService;

@Controller
public class BankController {

	@Autowired
	private BankService service;
	
	@RequestMapping("/")
	public String myHomePage()
	{
		return "home";
	}
	@RequestMapping("/addBank")
	public String BankForm(ModelMap model)
	{
	BankModel bank=new BankModel();
		model.put("bank", bank);
		return "bankregister";
	}
	@RequestMapping("/register")
	public String bankRegister(@ModelAttribute BankEntity bank,ModelMap Model)
	{
		
		BankEntity st=service.saveBankEntity(bank);
		return "succes";
	}
	
	@RequestMapping("/bal")
	public String bankbalance(@ModelAttribute BankEntity bank,ModelMap model)
	{
		
		return "balance";
	}
	@RequestMapping("/getbal")
	public String myBalance(@RequestParam int account_number ,@RequestParam String name,@RequestParam String password,ModelMap model) {
		model.put("balance",service.getBankEntity(account_number, name, password));
		
		return"getbal";
	}
	@RequestMapping("/dep")
	public String deposite(@ModelAttribute BankEntity bank,ModelMap model)
	{
		
		return "deposite";
	}
	@RequestMapping("/depbal")
	public String depositebalance(@ModelAttribute BankEntity bank,@RequestParam int account_number ,@RequestParam String name,@RequestParam String password,@RequestParam double amount,ModelMap model) {
		model.put("deposite", service.updateBankEntity(bank, account_number, name, password, amount));
		return "depbal";
	}@RequestMapping("/witdra")
	public String withdrawamount(@ModelAttribute BankEntity bank,ModelMap model)
	{
		
		return "withdrawform";
	}
	@RequestMapping("/witbal")
	public String withdrawbalance(@ModelAttribute BankEntity bank,@RequestParam int account_number ,@RequestParam String name,@RequestParam String password,@RequestParam double amount,ModelMap model) {
		model.put("withdrawform", service.withdrawBankEntity(bank, account_number, name, password, amount));
		
		return "withdrawbal";
	}
	@RequestMapping("/close")
	public String inactive(@ModelAttribute BankEntity bank,ModelMap model)
	{
		
		return "closeform";
	}
	@RequestMapping("/inact")
	public String closeacc(@ModelAttribute BankEntity bank,@RequestParam int account_number ,ModelMap model) {
		model.put("closeform", service.deleteBankEntity(bank, account_number));
		
		return "inactive";
	}
	@RequestMapping("/trns")
	public String transferfom(@ModelAttribute BankEntity bank,ModelMap model)
	{
		
		return "transferform";
	}
	@RequestMapping("/transfer")
	public String transferaccount(@ModelAttribute BankEntity bank,@RequestParam int account_number ,@RequestParam String name,@RequestParam String password,@RequestParam int targetacno,@RequestParam double amount,ModelMap model) {
		model.put("transferform", service.transferBankEntity(bank, account_number, name, password, targetacno, amount));
		
		return "transfer";
	}
	
	
}
