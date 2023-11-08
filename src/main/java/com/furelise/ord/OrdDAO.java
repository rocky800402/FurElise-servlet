package com.furelise.ord;

import java.util.List;

public interface OrdDAO {
	void add(Ord ord);

	void update(Ord ord);

	void delete(int ordID);

	Ord findByPK(Integer ordID);

	List<Ord> getAll();

}
