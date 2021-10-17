package model;

import java.sql.Connection;

public class Equipment 
{
	private int equipId;
	private String equipName;
	private String category;
	private String status;
	
	public Equipment() 
	{
		equipId = 0;
		equipName = "";
		category = "";
		status = "";
	}
	
	public Equipment(int equipId, String equipName , String category, String status) 
	{
		this.equipId = equipId;
		this.equipName = equipName;
		this.category = category;
		this.status = status;
	}
	
	public void setEquipId(int equipId) 
	{
		this.equipId = equipId;
	}
	
	public void setEquipName(String equipName) 
	{
		this.equipName = equipName;
	}
	
	public void setCategory(String category) 
	{
		this.category = category;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public int getEquipId() 
	{
		return equipId;
	}
	
	public String getEquipName() 
	{
		return equipName;
	}
	
	public String getCategory() 
	{
		return category;
	}
	
	public String getStatus() 
	{
		return status;
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
