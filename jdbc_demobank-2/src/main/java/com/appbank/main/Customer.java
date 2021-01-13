package com.appbank.main;

import java.sql.SQLException;
//import java.sql.Date;
import java.util.Date;
import java.util.List;

import com.appbank.dao.customerCrudDAO;
import com.appbank.dao.impl.customerCrudDAOimpl;
import com.appbank.exception.BusinessException;
import com.appbank.model.customer;

public class Customer {
 
	public static void main(String[] args) {
		customerCrudDAO dao = new customerCrudDAOimpl();
		
//		customer c=new customer("125-15-8978", "1920 Wyndam blvd w palm beach Fl 12478", "M", 12000d, "Johnny", "Piou", 123456, new Date(), 170843);
//try {
	//if(dao.createcustomer(c)!=0) {
		//System.out.println("player create successfully");
	//}
//} catch (BusinessException e) {
	//System.out.println(e.getMessage());
		try {
			customer customer=dao.getcustomerByid(123456);
			if(customer!=null) {
				System.out.println("Details of customer"+customer.getCustomerid());
				System.out.println(customer);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BusinessException e) {
			System.out.println("e");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//}
		try {
			List<customer>customerList=dao.getAllcustomers();
			if(customerList!=null && customerList.size()!=0 ) {
				System.out.println("Found" + customerList.size() + "num of customer in Dbprinting them all-------");
				for(customer c:customerList) {
					System.out.println(c);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
