package com.appbank.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

//import java.util.Date;

import java.util.List;


import com.appbank.dao.customersearchDAO;
import com.appbank.dao.dbutil.PostgresqlConnection;
import com.appbank.exception.BusinessException;
import com.appbank.model.customer;

public class customerSearchDAOimpl implements customersearchDAO {
	
	@Override
	public customer getCustomerByCustomerid(int customerid) throws BusinessException {
		customer customer=null;
		try(Connection connection= PostgresqlConnection.getConnection()){
			String sql="select customerssn,customeraddress,customergender,customertransaction,customerfirst,customerlast,employeeid,customerdob from bank.customer  where customerid=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		 preparedStatement.setInt(1,customerid);
		ResultSet resultSet= preparedStatement.executeQuery();
		if(resultSet.next()) {
		 customer =new customer("102-45-2135", "17 Ruelle Coutard Ht 09876", "M", (double) 12500, "Delatour", "Abraham", 123456, new Date(), 152489);
			customer.setCustomerid(customerid);
			customer.setCustomerssn(resultSet.getString("customerssn"));
			customer.setCustomeraddress(resultSet.getString("customeraddress"));
			customer.setCustomergender(resultSet.getString("customergender"));
			customer.setCustomertransaction(resultSet.getDouble("customertransaction"));
			customer.setCustomerfirst(resultSet.getString("customerfirst"));
			customer.setCustomerlast(resultSet.getString("customerlast"));
			customer.setEmployeeid(resultSet.getInt("employeeid"));
			customer.setCustomerdob(resultSet.getDate("customerdob"));
		}else {
			throw new BusinessException("no customer found with that id"+ customerid);
		}
		
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException(" Internal error occured contact sys admin");
			}
			
		return customer;
	}
	

	@Override
	public customer getCustomerByCustomerssn(String customerssn) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customer> getAllCustomers() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customer> getCustomersByCustomerid(int customerid) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customer> getCustomersByCustomergender(String customergender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customer> getCustomersByCustomeraddress(String customergenderaddress) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customer> getCustomersByCustomerfirst(String customerfirst) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customer> getCustomersByCustomerlats(String customerlast) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customer> getCustomersByCustomertransaction(Double customertransaction) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<customer> getCustomersByCustomerdob(Date customerdob) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customer> getEmployeeByEmployeeid(String employeeid) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
