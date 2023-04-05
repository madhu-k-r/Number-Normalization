package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import numberModuler.NumberModuler;
import org.apache.log4j.Logger;

@Service
public class NormalizationService {

	static Logger logger=Logger.getLogger(NormalizationService.class);

	List<NumberModuler> number_data=new ArrayList<>(
			Arrays.asList(
					new NumberModuler("919876541230","91","9876541230","444","postpaid","Local Number"),("9876541230","91","9876541230","444","postpaid","International Number")
					));

	private NumberModuler numberModuler;
	public List<NumberModuler> number() {
		logger.info("Data Fetched Successfully"+number_data);
		return number_data;
	}
	public List<String> getData(String orginalNumber) {
		String cc="";
		String mn="";
		String area="";
		if(orginalNumber.length()==12)
		{
			for(int i=0;i<2;i++)
			{
				cc=cc+orginalNumber.charAt(i);
			}
			for(int i=2;i<orginalNumber.length();i++)
			{
				mn=mn+orginalNumber.charAt(i);
			}
			area="Local Number";
			logger.info(List.of("Area = "+area, "Country Code = "+cc ,"Original Number = "+mn));
		  return  List.of("Area = "+area, "Country Code = "+cc ,"Original Number = "+mn);
		}
		else if(orginalNumber.length()==10)
		{
			for(int i=0;i<3;i++)
			{
				cc=cc+orginalNumber.charAt(i);
			}
			for(int i=3;i<orginalNumber.length();i++)
			{
				mn=mn+orginalNumber.charAt(i);
			}
			area="International Number";
			logger.info(List.of("Area = "+area, "Country Code = "+cc ,"Original Number = "+mn));
		  return  List.of("Area = "+area ,"Country Code = "+cc ,"Original Number = "+mn);
		}
		else
		{
			logger.info(List.of("Invalid Number "+orginalNumber));
			return  List.of("Invalid Number "+orginalNumber);
		}
	}
	public void addDate(NumberModuler numberModuler) {
		logger.info("Data Added "+numberModuler);
			number_data.add(numberModuler);
	}
	public NumberModuler getAllData(NumberModuler numberModuler, String orginalNumber) {
		logger.info("Data Retrived Successfully "+number_data.stream().filter(t-> t.getOriginalNumber().equals(orginalNumber)).findFirst().get());
		return number_data.stream().filter(t-> t.getOriginalNumber().equals(orginalNumber)).findFirst().get();
	}
	public void updateData(NumberModuler numberModuler, String orginalNumber) {
		for(int i=0;i<number_data.size();i++)
		{
			NumberModuler n=number_data.get(i);
			if(n.getOriginalNumber().equals(orginalNumber))
			{
				logger.info("Data updated "+ i+" "+ numberModuler);
				number_data.set(i, numberModuler);
				return;
			}
		}
	}
	public void deleteData(NumberModuler numberModuler, String originalNumber) {
		logger.info("Data Removed "+numberModuler);
		number_data.removeIf(t->t.getOriginalNumber().equals(originalNumber));		
	}

}
