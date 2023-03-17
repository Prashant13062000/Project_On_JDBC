package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Bank;

public class BankDaoImpl {
	
	
	public List<Bank>  findAll() throws ClassNotFoundException, SQLException
	{
		ArrayList<Bank> list=new ArrayList<Bank>();
				Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/123prashant","root","prashant");
       

        PreparedStatement statement=con.prepareStatement("select * from Bank");
        ResultSet rs=statement.executeQuery();
        while(rs.next())
        {
        	Bank e=new Bank();

        	e.setAcc_no(rs.getInt(1));
        	e.setPassword(rs.getString(2));
        
        	e.setName(rs.getString(3));
        	e.setBalance(rs.getString(4));
        	list.add(e);
        }
        con.close();
		
		
		return list;
		
	}
	public void CreatAccountBank(Bank b) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/123prashant","root","prashant");
		 PreparedStatement statement=con.prepareStatement("insert into Bank values(?,?,?,?)");
	        statement.setInt(1, b.getAcc_no());
	        statement.setString(2, b.getPassword());
	        statement.setString(3, b.getName());
	        statement.setString(4, b.getBalance());
	        
	       
	        statement.executeUpdate();
	        con.close();
	}
	public void UpdateBank(Bank b) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/123prashant","root","prashant");
		 PreparedStatement statement=con.prepareStatement("update Bank set Balance=? where Acc_no=?");
		 statement.setString(1,b.getBalance());
		 statement.setInt(2,b.getAcc_no());

	        statement.execute();
	        con.close();
			
	}

	
	public ArrayList<Bank> BalanceBank(Bank b) throws ClassNotFoundException, SQLException
	{
		ArrayList<Bank> list=new ArrayList<Bank>();
	 Class.forName("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/123prashant","root","prashant");

 PreparedStatement statement=con.prepareStatement("CREATE VIEW Sample as SELECT Balance FROM Bank WHERE Acc_no=?");
 statement.setInt(1,b.getAcc_no());
 PreparedStatement statement1=con.prepareStatement("Select * from Sample");
 PreparedStatement statement2=con.prepareStatement("Drop view Sample");


 
  ResultSet rs=statement1.executeQuery();
  while(rs.next())
  {
  	Bank e=new Bank();

  
  	e.setBalance(rs.getString(1));
  	list.add(e);
  }

 
 con.close();


return list;
	}
public void DeleteBank(Bank b) throws ClassNotFoundException, SQLException
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/123prashant","root","prashant");
	PreparedStatement statement=con.prepareStatement("Delete from Bank where Acc_no=?");
	statement.setInt(1,b.getAcc_no());
	statement.execute();
    con.close();
}
	

}
