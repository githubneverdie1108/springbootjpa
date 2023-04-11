package com.nhatnvq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhatnvq.entities.May;
import com.nhatnvq.repository.MayRepository;

@Service
public class MayService {
	@Autowired
	private MayRepository mayRepository;
	
	List<May> getListByViTri(String viTri){
		return mayRepository.getListByViTri(viTri);
	}
	
	
	
	
	
}
