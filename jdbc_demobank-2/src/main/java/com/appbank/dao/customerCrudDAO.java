package com.appbank.dao;

import java.util.List;

import com.appbank.exception.BusinessException;
import com.appbank.model.customer;

public interface customerCrudDAO {
	
public int createcustomer(customer Customer) throws BusinessException;
public void deletecustomer(int customerid);
public int updatecustomeraddress(int customerid, String newcustomeraddress);
public customer getcustomerByid(int customerid);
public List<customer>getAllcustomers();
}
