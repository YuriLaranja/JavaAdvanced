package model.entities;

import model.exceptions.WithdrawException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double whitdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = whitdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double whitdrawLimit) {
		this.withdrawLimit = whitdrawLimit;
	}
	public void deposit(Double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		validatewithdraw(amount);
		balance-=amount;
	}
	public void validatewithdraw (Double amount) {
		if(amount>withdrawLimit) {
			throw new WithdrawException("Withdraw error: The amount exceeds withdraw limit");
		}
		if(amount>balance) {
			throw new WithdrawException("Withdraw error: Not enough balance");
		}
		
	}
}
