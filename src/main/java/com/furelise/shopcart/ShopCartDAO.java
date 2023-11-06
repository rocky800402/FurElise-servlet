package com.furelise.shopcart;

import java.util.List;

public interface ShopCartDAO {
	
	void add(ShopCart shopCart);

	void update(ShopCart shopCart);

	void delete(int memID,int pID);

	ShopCart findByPK(Integer memID,Integer pID);

	List<ShopCart> getAll();

}
