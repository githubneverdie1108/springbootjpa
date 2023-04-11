package com.nhatnvq.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nhatnvq.entities.May;


public interface MayRepository extends CrudRepository<May, String>{
	@Query("SELECT m FROM May m WHERE m.viTri = ?")
	List<May> getListByViTri(String viTri);

}
