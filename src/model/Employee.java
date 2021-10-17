package model;

import java.sql.*;
import java.io.Serializable;


//Try out using hibernate for this one 

public class Employee 
{
	private int staffId;
	private String empName;
	private String empPassword;
	
	public Employee() 
	{
		staffId = 0;
		empName = "";
		empPassword = "";
	}
	
	public Employee(int staffId, String empName , String empPassword) 
	{
		this.staffId = staffId;
		this.empName = empName;
		this.empPassword = empPassword;
	}
	
	public void setStaffId(int staffId) 
	{
		this.staffId = staffId;
	}
	
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	
	public void setEmpPassword(String empPassword) 
	{
		this.empPassword = empPassword;
	}
	
	
	
	public int getStaffId() 
	{
		return staffId;
	}
	
	public String getEmpName() 
	{
		return empName;
	}
	
	public String getEmpPassword() 
	{
		return empPassword;
	}
	
	
	
	public void create() 
	{
		
	}
	
	public void readAll() 
	{
		
	}
	
	public void update() 
	{
		
	}
	
	public void delete() 
	{
		
	}

}
