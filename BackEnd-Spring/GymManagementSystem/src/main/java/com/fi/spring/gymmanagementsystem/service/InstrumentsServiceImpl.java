package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.InstrumentsEntity;
import com.fi.spring.gymmanagementsystem.repository.InstrumentsRepository;


@Service
public class InstrumentsServiceImpl implements InstrumentsService
{
		@Autowired
		InstrumentsRepository repository;
		
	@Override
	public List<InstrumentsEntity> getAllInstruments() {
		return repository.getAllInstruments();
	}

}
