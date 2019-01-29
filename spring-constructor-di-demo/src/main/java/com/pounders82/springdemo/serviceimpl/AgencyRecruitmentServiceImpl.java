package com.pounders82.springdemo.serviceimpl;

import java.util.Random;

import com.pounders82.springdemo.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruiteEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n"  + companyName + "'s " + departmentName + " hired " + random.nextInt(numberOfRecruitments)
		+ " employees "+ "using various hiring agencies";
		
		return hiringFacts;
	}

}
