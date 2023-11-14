package com.furelise.estabcase;

import java.util.List;

public interface EstabCaseDAO {
	void add(EstabCase estabCase);

	void update(EstabCase estabCase);

//	void delete(int estabCaseID);

	EstabCase findByPK(Integer estabCaseID);

	List<EstabCase> getAll(); 
}
