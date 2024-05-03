package com.bank.pentagon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class CustomerInterface {
   public static void showDetails() {
	// TODO Auto-generated method stub
	   System.out.println("welcome to pentagon UI");
	   System.out.println("Select an option");
	   System.out.println("1.check Account balance");
	   System.out.println("2.Deposit");
	   System.out.println("3.Withdraw");
	   System.out.println("4.Transfer amount");
	   System.out.println("5.Generate PIN");
	   System.out.println("6.Go back to main Menu");
	   
	   
	   int choice=0;
	   switch(choice)
	   {
	   case 1:
		   Check();
		   break;
	   case 2:
		   //deposit()
		   break;
	   case 3:
		   //withdraw()
		   break;
	   case 4:
		   //transfer
		   break;
	   case 5:
		   //generatepin
		   break;
	   case 6:
		   System.out.println("returning into main menu");
		   System.exit(0);
		   default:
			   System.out.println("Invalid choice");
			   
	      
	   }

}

private static void Check() {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	String PHONE="SELECT *FROM PENTAGON12 WHERE ACCNO=?";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?"
				+"user=root&password=tiger");
	   ps=con.prepareStatement(PHONE);
	   System.out.println("acc no");
	   
	   int acc=sc.nextInt();
	   ps.setInt(1, acc);
	   rs=ps.executeQuery();
	   if(rs.next())
	   {
		   Long PHONE1=rs.getLong(10);
		   String name=rs.getString(2);
		   System.out.println("Dear"+name+"your balance is");
		   
	   }
	   else
	   {
		   System.out.println("invalid acc Number");
	   }
	   
	} catch (ClassNotFoundException |SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
