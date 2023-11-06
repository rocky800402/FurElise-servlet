package com.furelise.productclass;

import java.util.List;


public interface ProductClassDAO {
	void add(ProductClass productClass);
	void update(ProductClass productClass);
	void delete(int pClassID);
	ProductClass findByPK(Integer pClassID);
	List<ProductClass> getAll();
}
