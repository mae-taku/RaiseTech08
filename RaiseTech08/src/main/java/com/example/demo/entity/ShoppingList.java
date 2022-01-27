package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class ShoppingList {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Max(50)
	private String name;
	
	@NotNull
	private int quantity;
	
	@NotNull
	private int price;	
}
