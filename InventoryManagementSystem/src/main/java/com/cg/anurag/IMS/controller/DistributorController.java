package com.cg.anurag.IMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.anurag.IMS.dto.Distributor;
import com.cg.anurag.IMS.service.DistributorService;
@RestController
public class DistributorController 
{
    @Autowired
	DistributorService  distributorService;
	public void setDistributorService(DistributorService distributorService)
	{
		this.distributorService=distributorService;
	}
	
   @GetMapping("/getDistributor/{distributorId}")
   public Distributor getDistributor(@PathVariable int distributorId)
   {
	   return distributorService.getDistributor(distributorId);
   }
   
   @GetMapping("/getDistributor")
   public List<Distributor> getDistributor()
   {
	   return distributorService.getDistributor();
   }
}
