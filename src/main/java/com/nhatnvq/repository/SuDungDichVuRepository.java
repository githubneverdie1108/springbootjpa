package com.nhatnvq.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nhatnvq.entities.SuDungDichVu;

@Repository
public interface SuDungDichVuRepository extends CrudRepository<SuDungDichVu, String>{
}
