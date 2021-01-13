package com.appbank.main;

import java.util.Scanner;

import com.appbank.exception.BusinessException;
import com.appbank.model.customer;
import com.appbank.service.customersearchService;


public class customerSearchMain {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcomw to customer search");
		int ch=0;
	
		do {
			System.out.println(" CUSTOMER SEARCH MENEU");
			System.out.println("======================================");
			System.out.println(" ");
			System.out.println("1--Search By CustomerID");
			System.out.println(" ");
			System.out.println("2--Search By CustomerSSN");
			System.out.println("3--Search By CustomerADDRESS");
			System.out.println("4--Search By CustomerGENDER");
			System.out.println("5--Search By CustomerTRANSACTION");
			System.out.println("6--Search By CustomerFIRST");
			System.out.println("7--Search By CustomerLAST");
			System.out.println("8--Search By EmployeeID");
			System.out.println("9--Search By CustomerDOB");
			System.out.println("10--Search ALL");
			System.out.println("11--EXIT");
			System.out.println("Please eneter a choice between 1 to 10 :");
			try {
			ch = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {}
			
			switch(ch) {
			case 1:System.out.print("Enter customerId to get customer details------");
			try{
				int customerid = Integer.parseInt(sc.nextLine());
				try {
					customer customer = customersearchService.getCustomerByCustomerid(customerid);
					if(customer!=null) {
						System.out.println("customer find with Id");
						System.out.println("customer");
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				
			}catch(NumberFormatException e) {
				System.out.println("----customer cannot be found,it should be only numbers----");
			}
			
				break;
			case 2:System.out.print("Thank for your interest this site ie under constructive");
				break;
			case 3:System.out.print("Thank for your interest this site ie under constructive");
				break;
			case 4:System.out.print("Thank for your interest this site ie under constructive");
				break;
			case 5:System.out.print("Thank for your interest this site ie under constructive");
				break;
			case 6:System.out.print("Thank for your interest this site ie under constructive");
				break;
			case 7:System.out.print("Thank for your interest this site ie under constructive");
				break;
			case 8:System.out.print("Thank for your interest this site ie under constructive");
				break;
			case 9:
				break;
			case 10:System.out.print("Thank for your interest this site ie under constructive");
				break;
			case 11:System.out.print("Thanks for using this App");
				break;
				default:System.out.println("invalid option Retry--------------");
					break;
			
			}

	}while (ch!=11);

}
}
