package com.entity;

public class Bank {
	private String name;
	private int Acc_no;
	private String Deposite;
	private String Withdrow;
	private String Balance;
	private String Password;
	
	public Bank()
	{
	}

	public Bank(String name, int acc_no, String deposite, String withdrow, String balance, String password) {
		super();
		this.name = name;
		this.Acc_no = acc_no;
		this.Deposite = deposite;
		this.Withdrow = withdrow;
		this.Balance = balance;
		this.Password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcc_no() {
		return Acc_no;
	}

	public void setAcc_no(int acc_no) {
		Acc_no = acc_no;
	}

	public String getDeposite() {
		return Deposite;
	}

	public void setDeposite(String deposite) {
		Deposite = deposite;
	}

	public String getWithdrow() {
		return Withdrow;
	}

	public void setWithdrow(String withdrow) {
		Withdrow = withdrow;
	}

	public String getBalance() {
		return Balance;
	}

	public void setBalance(String balance) {
		Balance = balance;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String i) {
		Password = i;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", Acc_no=" + Acc_no + ", Balance=" + Balance + "]";
	}

	
	
	
	
	

}
