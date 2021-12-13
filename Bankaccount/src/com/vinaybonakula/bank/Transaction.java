package com.vinaybonakula.bank;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
	private Date date;
	private int amount;
	private Transactiontype type;
	public enum Transactiontype{
		DEBIT,CREDIT
	}
	
	public Transaction(Date date, int amount, Transactiontype type) {
		super();
		this.date = date;
		this.amount = amount;
		this.type = type;
	}
	public Date getDate() {
		return date;
	} 
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return "Transaction [date=" + new SimpleDateFormat("dd-MM-yyyy").format(date) + ", amount=" + amount + ", transactiontype=" + type + "]";
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Transactiontype gettype() {
		return type;
	}
	
	public void type(Transactiontype type) {
		this.type = type;
	}
	

}
