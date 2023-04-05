package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import numberModuler.NumberModuler;

@RestController
public class ControllerNormalization {

	@Autowired
	private NormalizationService normalizationService;
	@RequestMapping("/fetch")
	public List<NumberModuler> number()
	{
		return normalizationService.number();
	}
	@RequestMapping("/check/{orginalNumber}")
	public List<String> getData(@PathVariable String orginalNumber)
	{
		return normalizationService.getData(orginalNumber);
	}
	@RequestMapping(method = RequestMethod.POST,value="/add")
	public void addData(@RequestBody NumberModuler numberModuler)
	{
		normalizationService.addDate(numberModuler);
	}
	@RequestMapping("/fetch/{orginalNumber}")
	public NumberModuler getAllData(@RequestBody NumberModuler numberModuler,@PathVariable String orginalNumber)
	{
		return normalizationService.getAllData(numberModuler,orginalNumber);
	}
	@RequestMapping(method = RequestMethod.PUT,value="/update/{orginalNumber}")
	public void updateData(@RequestBody NumberModuler numberModuler,@PathVariable String orginalNumber)
	{
		 normalizationService.updateData(numberModuler,orginalNumber);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/delete/{originalNumber}")
	public void deleteData(@RequestBody NumberModuler numberModuler,@PathVariable String originalNumber)
	{
		normalizationService.deleteData(numberModuler,originalNumber);
	}
}