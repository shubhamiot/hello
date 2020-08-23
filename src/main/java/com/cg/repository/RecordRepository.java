package com.cg.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.model.Record;

public interface RecordRepository extends CrudRepository<Record, Integer> {

}
