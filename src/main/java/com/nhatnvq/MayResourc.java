package com.nhatnvq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nhatnvq.entities.May;
import com.nhatnvq.repository.MayRepository;

@RestController
public class MayResourc {
	@Autowired
	MayRepository mayRepo;
	
	@GetMapping("/may")
	public May getMay() {
		May a = new May("MAY1234", "12", "bận");
		May b = mayRepo.save(a);
		return b;
	}
	
	@PostMapping("/may")
	public void updateMay(May may) {
		mayRepo.save(may);
	}
	
	@DeleteMapping("/may/{maMay}")
	public void deletaMay(@PathVariable String viTri) {
		mayRepo.delete(viTri);
	}
}
