package com.appbank.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import com.appbank.dao.customerCrudDAO;
import com.appbank.dao.dbutil.PostgresqlConnection;
import com.appbank.exception.BusinessException;
import com.appbank.model.customer;

public class customerCrudDAOimpl implements customerCrudDAO {
	
	@Override
	public int createcustomer(customer customer) throws BusinessException {
		int c=0;
		try(Connection connection= PostgresqlConnection.getConnection()){
			String sql="insert into customer.customer(customerssn,customeraddress,customergender,customertransaction,customerfirst,customerlast,employeeid,customerdob,customerid) values (?,?,?,?,?,?,?,?,? )";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, customer.getCustomerssn());
		preparedStatement.setString(2, customer.getCustomeraddress());
		preparedStatement.setString(3, customer.getCustomergender());
		preparedStatement.setDouble(4, customer.getCustomertransaction());
		preparedStatement.setString(5, customer.getCustomerfirst());
		preparedStatement.setString(6, customer.getCustomerlast());
		preparedStatement.setInt(7, customer.getEmployeeid());
		preparedStatement.setDate(8, new java.sql.Date(customer.getCustomerdob().getTime()));
		preparedStatement.setInt(9, customer.getCustomerid());
		c=preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
		throw new BusinessException(" Internal error occured contact sys admin");
		}
		return c;
	}

	@Override
	public void deletecustomer(int customerid) {
		// TODO Auto-generated method stub
	String sql="";	
	}

	@Override
	public int updatecustomeraddress(int customerid, String newcustomeraddress) {
		String sql="update customer.Custom set customeraddress = ? where customerid =?";
		return 0;
	}

	@SuppressWarnings("null")
	@Override
	public customer getcustomerByid(int customerid) throws BusinessException, ClassNotFoundException, SQLException {
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


	@SuppressWarnings("unchecked")
	@Override
	public List<customer> getAllcustomers() throws BusinessException {
		List<customer>customerList=new ArrayList<>();
		try(Connection connection= PostgresqlConnection.getConnection()){
			//String sql="select customerssn,customeraddress,customergender,customertransaction,customerfirst,customerlast,employeeid,customerdob; customerid from bank.customer";
			String sql="select * from bank.customer";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultSet= preparedStatement.executeQuery();
		while(resultSet.next()) {
		 customer customer= new customer("102-45-2135", "17 Ruelle Coutard Ht 09876", "M", (double) 12500, "Delatour", "Abraham", 123456, new Date(), 152489);
			//customer customer=new customer();
		 
			customer.setCustomerssn(resultSet.getString("customerssn"));
			customer.setCustomeraddress(resultSet.getString("customeraddress"));
			customer.setCustomergender(resultSet.getString("customergender"));
			customer.setCustomertransaction(resultSet.getDouble("customertransaction"));
			customer.setCustomerfirst(resultSet.getString("customerfirst"));
			customer.setCustomerlast(resultSet.getString("customerlast"));
			customer.setEmployeeid(resultSet.getInt("employeeid"));
			customer.setCustomerdob(resultSet.getDate("customerdob"));
			customer.setCustomerid(resultSet.getInt("customerid"));
			customerList.add(customer);
		}
		if(customerList.size()==0) {
			throw new BusinessException("no customer found with that DB");
		}
		
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException(" Internal error occured contact sys admin");
			}
			
		
		return customerList;
	}
	

}

