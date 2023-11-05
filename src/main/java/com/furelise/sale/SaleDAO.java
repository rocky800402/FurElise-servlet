package com.furelise.sale;

import java.util.List;


public interface SaleDAO {
	void add(Sale sale);

	void update(Sale sale);

	void delete(int saleID);

	Sale findByPK(Integer saleID);

	List<Sale> getAll();


}
