package com.eksad.latihanstringmvc.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eksad.latihanstringmvc.model.Brand;
import com.eksad.latihanstringmvc.repository.BrandRepositoryDao;

@Controller
@RequestMapping("/brand")
public class BrandController {
	
	@Autowired
	BrandRepositoryDao brandRepositoryDao;
	
	@RequestMapping("")
	public String index(Model model) {
		List<Brand> list= brandRepositoryDao.findAll();
		
		model.addAttribute("listbrand", list);
		return "list-brand";
	}
	@RequestMapping("/add")
	public String addBrand(Model model) {
		Brand brand= new Brand();
		model.addAttribute("Brand", brand);
		return "addbrand";
	}

	@RequestMapping(value= "/save", method= RequestMethod.POST)
	public String save(@ModelAttribute Brand brand) {
		brandRepositoryDao.save(brand);
		return "redirect:/brand";
	}

	@RequestMapping(value= "delete/{id}")
	public String deleteBrand(@PathVariable Long id) {
		
		brandRepositoryDao.delete(id);
		return "redirect:/brand/";	
	}
	
	@RequestMapping(value="/update/{id}", method = RequestMethod.GET)
	public String editbrand(@PathVariable Long id, Model model) 
	
	{
			Brand brand =  brandRepositoryDao.findOne(id);
			model.addAttribute("brand", brand);
			return "addBrand";
	}
	
	@RequestMapping(value="/edit/{id}", method= RequestMethod.GET)
	public String editBrand(@PathVariable Long id, Model model) {
		Brand brand= brandRepositoryDao.findOne(id);
		model.addAttribute("brand", brand);
		
		return "addbrand";
	}
	

}