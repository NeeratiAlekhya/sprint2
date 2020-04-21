package com.cg.anurag.IMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.anurag.IMS.dto.Supplier;
import com.cg.anurag.IMS.service.SupplierService;
@RestController
public class SupplierController {
	 @Autowired
		SupplierService  supplierService;
		public void setSupplierService(SupplierService supplierService)
		{
			this.supplierService=supplierService;
		}
		
	   @GetMapping("/getSupplier/{supplierId}")
	   public Supplier getSupplier(@PathVariable int supplierId)
	   {
		   return supplierService.getSupplier(supplierId);
	   }
	   
	   @GetMapping("/getSupplier")
	   public List<Supplier> getSupplier()
	   {
		   return supplierService.getSupplier();
	   }
	}
