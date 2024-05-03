package com.bank.pentagon;
import java.sql.*;
import java.util.Scanner;
public class Employe {
	public static void AddCustomerData() {
		
		
		Connection con=null;
		PreparedStatement ps=null;
		String qry1="INSERT INTO PENTAGON12 (Accno,Name,Phone)"
				+ "VALUES(?,?,?)";
		Scanner sc=new Scanner(System.in);
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BANK?"
					+"user=root&password=tiger");
			System.out.println("<----Employee Interface");
			System.out.println("Welcome to bank");
			
			ps=con.prepareStatement(qry1);
		    System.out.println("Enter the accno.:");
		    int acc=sc.nextInt();
		    ps.setInt(1,acc);
		    System.out.println("ENter the customer name");
		    String nm=sc.next();
		    ps.setString(2, nm);
		    System.out.println("enter the Phone NO.:");
		    Long ph=sc.nextLong();
		    ps.setLong(3, ph);
		    ps.executeUpdate();
		    System.out.println("added succefully");
		     
			
			
			
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
