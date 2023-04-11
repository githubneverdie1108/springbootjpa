package com.nhatnvq.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nhatnvq.entities.May;
import com.nhatnvq.repository.MayRepository;

@RestController
public class MayResourc {
	@Autowired
	MayRepository mayRepo;
	
	@GetMapping("/mayList")
	public List<May> getAllMay() {
		return (List<May>)mayRepo.findAll();
	}
	
	@GetMapping("/mayList/{viTri}")
	public List<May> getAllMay(@PathVariable String viTri) {
		return (List<May>)mayRepo.getListByViTri(viTri);
	}
	
	@GetMapping("/may/{maMay}")
	public May getMay(@PathVariable String maMay) {
		return (May)mayRepo.findOne(maMay);
	}
	
	@PostMapping("/may")
	public void updateMay(@RequestBody May may) {
		mayRepo.save(may);
	}
	
	@DeleteMapping("/may/{maMay}")
	public void deletaMay(@PathVariable String maMay) {
		mayRepo.delete(maMay);
	}
	
	@PutMapping("/may")
	public ResponseEntity<List<May>> update (@RequestBody List<May> mayList){
		List<May> updatedMay = new ArrayList<>();
		for (May may : mayList) {
			updatedMay.add(mayRepo.save(may));
		}
		return ResponseEntity.ok(updatedMay);
	}
}
