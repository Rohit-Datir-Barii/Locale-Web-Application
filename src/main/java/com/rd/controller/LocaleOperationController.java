package com.rd.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rd.service.ILocaleInfoService;

@Controller
public class LocaleOperationController {
	 @Autowired
		private ILocaleInfoService service;
		
		@RequestMapping(value="/welcome",method=RequestMethod.GET)
		public  String showHome() {
			return "home";
		}
		
		
		//@RequestMapping(value="/display", method= RequestMethod.GET)
		@GetMapping("/display")
		public  String  viewData() {
			System.out.println("TestController.viewData()");
			return  "home_page";
		}
		@RequestMapping(value="/countries",method=RequestMethod.GET)
		public Model  fetchCountries() {
			Set<String> countriesList=null;
			Model model=null;
			//use Service
			countriesList=service.getAllCountries();
			//adding multiple model attribues
			model=new  ExtendedModelMap();
			model.addAttribute("listInfo", countriesList);
			model.addAttribute("operation", "countries");
			model.addAttribute("countriesCount", countriesList.size());
			return model;
		}//method 

}
