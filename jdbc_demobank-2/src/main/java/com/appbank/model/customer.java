package com.appbank.model;

import java.util.Date;

public class customer {
	private int customerid;
	private String customerssn;
	private String customeraddress;
	private String customergender;
	private Double customertransaction;
	private String customerfirst;
	private String customerlast;
	private int employeeid;
private Date customerdob;
public customer() {
	
}
public customer(int customerid, String customerssn, String customeraddress, String customergender,
		Double customertransaction, String customerfirst, String customerlast, int employeeid, Date customerdob) {
	super();
	this.customerid = customerid;
	this.customerssn = customerssn;
	this.customeraddress = customeraddress;
	this.customergender = customergender;
	this.customertransaction = customertransaction;
	this.customerfirst = customerfirst;
	this.customerlast = customerlast;
	this.employeeid = employeeid;
	this.customerdob = customerdob;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomerssn() {
	return customerssn;
}
public void setCustomerssn(String customerssn) {
	this.customerssn = customerssn;
}
public String getCustomeraddress() {
	return customeraddress;
}
public void setCustomeraddress(String customeraddress) {
	this.customeraddress = customeraddress;
}
public String getCustomergender() {
	return customergender;
}
public void setCustomergender(String customergender) {
	this.customergender = customergender;
}
public Double getCustomertransaction() {
	return customertransaction;
}
public void setCustomertransaction(Double customertransaction) {
	this.customertransaction = customertransaction;
}
public String getCustomerfirst() {
	return customerfirst;
}
public void setCustomerfirst(String customerfirst) {
	this.customerfirst = customerfirst;
}
public String getCustomerlast() {
	return customerlast;
}
public void setCustomerlast(String customerlast) {
	this.customerlast = customerlast;
}
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public Date getCustomerdob() {
	return customerdob;
}
public void setCustomerdob(Date customerdob) {
	this.customerdob = customerdob;
}
@Override
public String toString() {
	return "customer [customerid=" + customerid + ", customerssn=" + customerssn + ", customeraddress="
			+ customeraddress + ", customergender=" + customergender + ", customertransaction=" + customertransaction
			+ ", customerfirst=" + customerfirst + ", customerlast=" + customerlast + ", employeeid=" + employeeid
			+ ", customerdob=" + customerdob + "]";
}

}
