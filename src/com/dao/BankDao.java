package com.dao;

import java.util.List;

import com.entity.Bank;


public interface BankDao {
	public List<Bank>viewAll();
	public void CreatAccountBank(Bank b);
	public void UpdateBank(Bank b);
	public void BalanceBank(Bank b);
	public void DelateBank(Bank b);
}
