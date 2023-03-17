package com.main;

import java.sql.SQLException;
import java.util.Scanner;

import Service.BankService;



public class BankMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	
		BankService b=new BankService();
		
		
		
		String s;
      Scanner sc=new Scanner(System.in);
      System.out.println("**** # Menu # ****");
     
      System.out.println("press #1.Creat Account in Phaltan Bank");
      System.out.println("press #2.Update Balance");
      System.out.println("press #3.Cheak Balance");
      System.out.println("press #4.Delete Account");
      System.out.println("press #5.View all Account");
      
      do
      {
    	  
    	  System.out.println("Enter the choice ");
    	  int choice=sc.nextInt();
    	  switch(choice)
    	  {
    	  case 1:
    		  
    		  b.CreatAccountBank();
    		 
    		  break;
    	  case 2:
    		  
    		  b.UpdateBank();
    		
    		 	 break;
    		 
    	  case 3:
    		  
    		  b.BalanceBank();

      		
     		 
     		 break;
    	  case 4:
    		  
    		  b.DeleteBank();
        		
      		 
      		 break; 	
    	  case 5:
    		  b.ViewAll();
    		  break;
    		  
    	  }
    	  System.out.println("do you want to continue");
    	   s=sc.next();

       }
	  while(s.equals("yes"));
System.out.println(" !!Thank you Visit Again!!");

}


}
