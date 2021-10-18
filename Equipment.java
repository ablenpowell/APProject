package net.javaguides.hibernate.util;

import java.io.Serializable;

import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity  
@Table(name= "equipment")  

public class Equipment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id   
	private int EquipID;    
	private String EquipName;  
	private String EquipStatus;
	private String EquipCategory;
	
	    
	public int getEquipID() {    
	    return EquipID;    
	}    
	public void setEquipID(int Equipid) {    
	    this.EquipID = Equipid;    
	}    
	public String getEquipName() {    
	    return EquipName;    
	}    
	public void setEquipName(String EquipName) {    
	    this.EquipName = EquipName;    
	}    
	public String getEquipstatus() {    
	    return EquipStatus;    
	}    
	public void setEquipstatus(String EquipStatus) {    
	    this.EquipStatus = EquipStatus;    
	}
	public String getEquipGat() {    
	    return EquipCategory;    
	}    
	public void setEquipCat(String EquipCategory) {    
	    this.EquipCategory= EquipCategory;    
	}
	 
	

}
