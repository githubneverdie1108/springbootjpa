package com.nhatnvq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
}
