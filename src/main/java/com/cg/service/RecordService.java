package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.model.Record;

import com.cg.repository.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository recordRepository;
	
	List<Record> getAllUsers()
	{
		List<Record> record= new ArrayList<>();
		recordRepository.findAll().forEach(record::add);
		return record;
	}
	
	public void addUser(Record record)
	{
		recordRepository.save(record);
	}
	
}
