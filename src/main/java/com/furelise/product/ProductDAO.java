package com.furelise.product;

import java.util.List;

public interface ProductDAO {

	void add(Product product);

	void update(Product product);

	void delete(int pID);

	Product findByPK(Integer pID);

	List<Product> getAll();

}
