package com.siva.model;

public class BankModel {
private int account_number;
private String name;

private String password;

private String confirmpassword;

private double amount;

private String address;

private long mobileno;

public BankModel() {
	super();
}

public BankModel(int account_number, String name, String password, String confirmpassword, double amount,
		String address, long mobileno) {
	super();
	this.account_number = account_number;
	this.name = name;
	this.password = password;
	this.confirmpassword = confirmpassword;
	this.amount = amount;
	this.address = address;
	this.mobileno = mobileno;
}

public int getAccount_number() {
	return account_number;
}

public void setAccount_number(int account_number) {
	this.account_number = account_number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getConfirmpassword() {
	return confirmpassword;
}

public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}

public  double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getMobileno() {
	return mobileno;
}

public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}

@Override
public String toString() {
	return "BankModel [account_number=" + account_number + ", name=" + name + ", password=" + password
			+ ", confirmpassword=" + confirmpassword + ", amount=" + amount + ", address=" + address + ", mobileno="
			+ mobileno + "]";
}

}
