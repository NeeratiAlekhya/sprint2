package com.cg.anurag.IMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.IMS.dto.Distributor;
@Repository
public interface DistributorDAO extends JpaRepository<Distributor,Integer>{

}
