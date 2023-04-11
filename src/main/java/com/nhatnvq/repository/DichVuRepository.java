package com.nhatnvq.repository;

import java.util.List;

import com.nhatnvq.entities.May;

public interface DichVuRepository{
	List<May> getAll();
	May getMay(String maMay);
	void save(May may);
	void delete(String maMay);
}
