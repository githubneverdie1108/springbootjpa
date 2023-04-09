package com.nhatnvq.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nhatnvq.entities.SuDungMay;

@Repository
public interface SuDungMayRepository extends CrudRepository<SuDungMay, String>{
}
