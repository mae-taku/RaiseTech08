package com.example.demo.entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ShoppingList {
	
	private int id;
	
	@Max(50)
	private String name;
	
	@NotNull
	private Integer quantity;
	
	@NotNull
	private int price;	
}
