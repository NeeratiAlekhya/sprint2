package com.cg.anurag.IMS.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.anurag.IMS.dao.DistributorDAO;
import com.cg.anurag.IMS.dto.Distributor;
@Service
public class DistributorService {
	 @Autowired
	    DistributorDAO Ddao;
	    public void setBdao(DistributorDAO ddao) { this.Ddao=ddao;}
	    @Transactional(readOnly=true)
	    public Distributor getDistributor(int distributorId)
	    {
	    	return Ddao.findById(distributorId).get();
	    }
	    @Transactional(readOnly=true)
	    public List<Distributor> getDistributor()
	    {
	    	return Ddao.findAll();
	    }
}
