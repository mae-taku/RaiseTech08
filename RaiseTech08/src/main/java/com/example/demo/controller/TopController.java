package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.SearchRequest;
import com.example.demo.entity.ShoppingList;
import com.example.demo.service.ListService;

@Controller
public class TopController {
	
	@Autowired
	private ListService service;
	
	@GetMapping("/top")
	public String getTop(Model model) {
	 return "top";
	}
		
    @PostMapping("/shoppingList")
    public String getList(Model model, @ModelAttribute ShoppingList list) {
        model.addAttribute("shoppingList", service.getList());
        return "shoppingList";
    }
    
    @PostMapping("/top/food")
    public String details(@ModelAttribute SearchRequest sr, Model model) {
    	ShoppingList food = service.details(sr);
        model.addAttribute("shoppingList", food);
        return "top";
    }
    
    @GetMapping("/register")
    public String getRegister(@ModelAttribute ShoppingList list) {
    	return "register";
    }
    
    @PostMapping("/register")
    public String create(@ModelAttribute ShoppingList list) {
        
        service.insertOne(list);
        return "redirect:/top";
    }
}
