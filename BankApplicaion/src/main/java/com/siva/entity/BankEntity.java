package com.siva.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SDFCBANK")
public class BankEntity {
	@Id
	private int account_number;
	private String name;

	private String password;

	private double amount;

	private String address;

	private long mobileno;
	private String status;
	public BankEntity() {
		super();
	}
	public BankEntity(int account_number, String name, String password, double amount, String address, long mobileno,
			String status) {
		super();
		this.account_number = account_number;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobileno = mobileno;
		this.status = status;
	}
	public int  getAccount_number() {
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
	public double getAmount() {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BankEntity [account_number=" + account_number + ", name=" + name + ", password=" + password
				+ ", amount=" + amount + ", address=" + address + ", mobileno=" + mobileno + ", status=" + status
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
	