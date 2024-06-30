package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fi.spring.gymmanagementsystem.entity.InstrumentsEntity;
import com.fi.spring.gymmanagementsystem.service.InstrumentsService;



@RestController
@RequestMapping("api")

public class InstrumentsController 
{
	@Autowired
	InstrumentsService instrumentsService;
	
	 @GetMapping("getAllinstruments")
	    public List<InstrumentsEntity> getAllInstruments() {
			
			return instrumentsService.getAllInstruments();
		}
	 
}
