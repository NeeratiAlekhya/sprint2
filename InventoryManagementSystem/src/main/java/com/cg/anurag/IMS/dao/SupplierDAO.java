package com.cg.anurag.IMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.IMS.dto.Supplier;
@Repository
public interface SupplierDAO extends JpaRepository<Supplier,Integer> {

}
