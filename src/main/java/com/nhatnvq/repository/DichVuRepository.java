package com.nhatnvq.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nhatnvq.entities.DichVu;

public interface DichVuRepository extends CrudRepository<DichVu, String>{
}
