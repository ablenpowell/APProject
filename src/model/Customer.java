package model;

import java.sql.*;
import java.io.Serializable;

public class Customer implements Serializable
{
	private int cusId;
	private String cusName;
	private String cusPassword;
	private float accBal;
	
	public Customer() 
	{
		cusId = 0;
		cusName = "";
		cusPassword = "";
		accBal = 0f;
	}
	
	public Customer(int cusId, String cusName , String cusPassword, float accBal) 
	{
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusPassword = cusPassword;
		this.accBal = accBal;
	}
	
	public void setCusId(int cusId) 
	{
		this.cusId = cusId;
	}
	
	public void setCusName(String cusName) 
	{
		this.cusName = cusName;
	}
	
	public void setCusPassword(String cusPassword) 
	{
		this.cusPassword = cusPassword;
	}
	
	public void setAccBal(float accBal) 
	{
		this.accBal = accBal;
	}
	
	public int getCusId() 
	{
		return cusId;
	}
	
	public String getCusName() 
	{
		return cusName;
	}
	
	public String getCusPassword() 
	{
		return cusPassword;
	}
	
	public void create(Connection con) 
	{
		
	}
	
	public void readAll(Connection con) 
	{
		
	}
	
	public void update(Connection con) 
	{
		
	}
	
	public void delete(Connection con) 
	{
		
	}
	

}
