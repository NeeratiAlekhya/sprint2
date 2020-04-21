package com.cg.anurag.IMS.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Distributor {
	@Id	
	   @Column(name="distributor_id")
	   int distributorId;
	   @Column(name="distributor_name")
	   String distributorName;
	   @Column(name="phoneno")
	   long phoneno;
	   @Column(name="address")
	   String address;
	   public Distributor() {}
	   public Distributor(int distributorId, String distributorName, long phoneno, String address) {
		super();
		this.distributorId = distributorId;
		this.distributorName = distributorName;
		this.phoneno = phoneno;
		this.address = address;
	}
	   public int getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
