package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface AleinRepo extends CrudRepository<Alien, Integer>
{
  
}
