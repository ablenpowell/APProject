package net.javaguides.hibernate.util;

import java.io.Serializable;

import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  


@Entity  
@Table(name= "employee")   

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id   
	private int EmpID;    
	private String EmpName;  
	private String EmpPassword;
	    
	public int getId() {    
	    return EmpID;    
	}    
	public void setId(int id) {    
	    this.EmpID = id;    
	}    
	public String getName() {    
	    return EmpName;    
	}    
	public void setName(String Name) {    
	    this.EmpName = Name;    
	}    
	public String getPassword() {    
	    return EmpPassword;    
	}    
	public void setPassword(String Password) {    
	    this.EmpPassword = Password;    
	}
	 

}
