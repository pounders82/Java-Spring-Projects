package com.pounders82.springdemo;

public class Organization {
	private String companyName;
	private int yearOfIncorporation;
	
	//public Organization() {}
	
	public Organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}


	public void corporateSlogan(){
		String slogan = "We build the ultimate driving machies!";
		System.out.println(slogan);
	}


	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}

}
