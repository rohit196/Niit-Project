package com.niit.MyShop.dao;

//import java.util.ArrayList;
import java.util.List;

import com.niit.MyShop.model.Supplier;

public interface SupplierDAO {
	
		public List<Supplier> list();
		
		public Supplier get(String id);
		public  void saveOrUpdate(Supplier supplier);
		public String delete(String id);
}
