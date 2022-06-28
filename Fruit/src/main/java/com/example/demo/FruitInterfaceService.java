package com.example.demo;

import java.util.List;

public interface FruitInterfaceService {

	public List<Fruit> getAllFruit(); 
	public void deleteFruit(int id);      
	public void saveOrUpdate(Fruit fruit); 
	public Fruit getFruitById(int id); 

	
	
}
