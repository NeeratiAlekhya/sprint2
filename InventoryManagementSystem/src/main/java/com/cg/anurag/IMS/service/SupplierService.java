package com.cg.anurag.IMS.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.anurag.IMS.dao.SupplierDAO;
import com.cg.anurag.IMS.dto.Supplier;
@Service
public class SupplierService {
	 @Autowired
	    SupplierDAO Sdao;
	    public void setSdao(SupplierDAO sdao) { this.Sdao=sdao;}
	    @Transactional(readOnly=true)
	    public Supplier getSupplier(int supplierId)
	    {
	    	return Sdao.findById(supplierId).get();
	    }
	    @Transactional(readOnly=true)
	    public List<Supplier> getSupplier()
	    {
	    	return Sdao.findAll();
	    }
}
