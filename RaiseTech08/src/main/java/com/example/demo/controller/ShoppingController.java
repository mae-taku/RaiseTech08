package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.ShoppingList;
import com.example.demo.service.ShoppingService;

/**
 * @author maetaku
 *買い物リストアプリコントローラ
 */

@Controller
public class ShoppingController {
	@Autowired
	ShoppingService service;
	
	/**
	 * 買い物リスト一覧を出力する
	 * @param model
	 * @return　list一覧
	 */
	@GetMapping("/list")
	String list(Model model) {
		List<ShoppingList> shoppingLists = service.findAll();
		model.addAttribute("list", shoppingLists);
		return "list";
	}
}
