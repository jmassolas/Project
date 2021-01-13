package com.appbank.service;

import java.util.Date;
import java.util.List;

import com.appbank.exception.BusinessException;
import com.appbank.model.customer;

public interface customersearchService {
	public static  customer getCustomerByCustomerid(int customerid) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	public customer getCustomerByCustomerssn(String customerssn) throws BusinessException;
	public List<customer>getAllCustomers() throws BusinessException;
	public List<customer>getCustomersByCustomerid(int customerid) throws BusinessException;
	public List<customer>getCustomersByCustomergender(String customergender) throws BusinessException;
	public List<customer>getCustomersByCustomeraddress(String customergenderaddress) throws BusinessException;
	public List<customer>getCustomersByCustomerfirst(String customerfirst) throws BusinessException;
	public List<customer>getCustomersByCustomerlats(String customerlast) throws BusinessException;
	public List<customer>getCustomersByCustomertransaction(Double customertransaction) throws BusinessException;
	public List<customer>getCustomersByCustomerdod(Date customergendob) throws BusinessException;
	public List<customer>getEmployeeByEmployeeid(String employeeid) throws BusinessException;
	
	

}
