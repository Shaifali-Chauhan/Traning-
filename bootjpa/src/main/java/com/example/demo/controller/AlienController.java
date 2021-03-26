package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.AleinRepo;
import com.example.demo.model.Alien;

@Controller
public class AlienController
{
	@Autowired
	AleinRepo repo;
	
	@RequestMapping("/")
 public String home()
 {
	return "home.html"; 
 }
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.html";
	}
}
