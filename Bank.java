package com.bank.pentagon;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		while(choice!=3)
		{
			System.out.println("welcome pentagon");
			System.out.println("select options");
			System.out.println("1.Employee interface");
			System.out.println("2.customer Interface");
			System.out.println("3.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Employe.AddCustomerData();
				break;
			case 2:
				CustomerInterface.showDetails();
				break;
			case 3:
				System.out.println("Existing the application,Thank You");
				break;
			
			}
		}
	}
}
