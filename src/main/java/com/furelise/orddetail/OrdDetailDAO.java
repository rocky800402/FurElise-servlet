package com.furelise.orddetail;

import java.util.List;

public interface OrdDetailDAO {

	void add(OrdDetail ordDetail);

	void update(OrdDetail ordDetail);

	void delete(int ordID, int pID);

	OrdDetail findByPK(Integer ordID, Integer pID);

	List<OrdDetail> getAll();

}
