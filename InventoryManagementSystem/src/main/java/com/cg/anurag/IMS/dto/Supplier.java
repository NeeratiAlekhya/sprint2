package com.cg.anurag.IMS.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Supplier {
	@Id	
	   @Column(name="supplier_id")
	   int supplierId;
	   @Column(name="supplier_name")
	   String supplierName;
	   @Column(name="phoneno")
	   long phoneno;
	   @Column(name="address")
	   String address;
	   public Supplier() {}
	   public Supplier(int supplierId, String supplierName, long phoneno, String address) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.phoneno = phoneno;
		this.address = address;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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
