package com.example.demo.entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import lombok.Data;

//@Entity
@Data
public class ShoppingList {
	
//	@Id
//	@GeneratedValue
	@NotNull
	private int id;
	
	@Max(50)
	private String name;
	
	@NotNull
	private int quantity;
	
	@NotNull
	private int price;	
}
