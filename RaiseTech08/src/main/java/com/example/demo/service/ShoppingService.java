package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ShoppingList;

/**
 * Spring JDBC のサービスクラス
 * @author maetaku
 */

@Service
public class ShoppingService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 全件検索メソッド
	 *@return 全件
	 */
	
	public List<ShoppingList> findAll(){
		
		//SQL
		String query = "SELECT * FROM shopping_list";
		
		List<ShoppingList> shoppingLists = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(ShoppingList.class));
		
		return shoppingLists;
	}
}
