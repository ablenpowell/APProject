package net.javaguides.hibernate.util;

import java.io.Serializable;

import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  


	@Entity  
	@Table(name= "customer")   

	public class Customer implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id   
		private int CusID;    
		private String CusName;  
		private String CusPassword;
		private float CusAccBal;
		
		    
		public int getCusId() {    
		    return CusID;    
		}    
		public void setCusId(int Cusid) {    
		    this.CusID = Cusid;    
		}    
		public String getCusName() {    
		    return CusName;    
		}    
		public void setCusName(String CusName) {    
		    this.CusName = CusName;    
		}    
		public String getCusPassword() {    
		    return CusPassword;    
		}    
		public void setCusPassword(String CusPassword) {    
		    this.CusPassword = CusPassword;    
		}
		public Float getCusBal() {    
		    return CusAccBal;    
		}    
		public void setCusBal(float CusAccBal) {    
		    this.CusAccBal = CusAccBal;    
		}
		 

	}

