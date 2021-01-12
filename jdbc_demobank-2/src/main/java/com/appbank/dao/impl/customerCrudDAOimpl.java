package com.appbank.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.appbank.dao.customerCrudDAO;
import com.appbank.dao.dbutil.PostgresqlConnection;
import com.appbank.exception.BusinessException;
import com.appbank.model.customer;

public class customerCrudDAOimpl implements customerCrudDAO {

	@Override
	public int createcustomer(customer Custom) throws BusinessException {
		int c=0;
		try(Connection connection= PostgresqlConnection.getConnection()){
			String sql="insert into customer.Customer(customerssn,customeraddress,customergender,customertransaction,customerfirst,customerlast,employeeid,customerdob,customerid) values (?,?,?,?,?,?,?,?,? )";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, Custom.getCustomerssn());
		preparedStatement.setString(2, Custom.getCustomeraddress());
		preparedStatement.setString(3, Custom.getCustomergender());
		preparedStatement.setDouble(4, Custom.getCustomertransaction());
		preparedStatement.setString(5, Custom.getCustomerfirst());
		preparedStatement.setString(6, Custom.getCustomerlast());
		preparedStatement.setInt(7, Custom.getEmployeeid());
		preparedStatement.setDate(8, new java.sql.Date(Custom.getCustomerdob().getTime()));
		preparedStatement.setInt(9, Custom.getCustomerid());
		} catch (ClassNotFoundException | SQLException e) {
		throw new BusinessException(" Internal error occuredcontact sys admin");
		}
		return c;
	}

	@Override
	public void deletecustomer(int customerid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updatecustomeraddress(int customerid, String newcustomeraddress) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public customer getcustomerByid(int customerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customer> getAllcustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
