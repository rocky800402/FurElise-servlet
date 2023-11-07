package com.furelise.orddetail;

import java.util.List;

public interface OrdDetailDAO {

	void add(OrdDetail ordDetail);

	void update(OrdDetail ordDetail);

	void delete(int dataID);

	OrdDetail findByPK(Integer dataID);

	List<OrdDetail> getAll();

}
