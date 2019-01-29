package com.pounders82.springdemo.serviceimpl;

import java.util.Random;

import com.pounders82.springdemo.service.BusinessService;

public class EcommerceSerciceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Orginization, " + companyName + " provides an outstanding Ecommerce platform." + 
		"\nThe annual income exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}

}
