package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ShoppingList;
import com.example.demo.repository.ShoppingJpaRepository;

/**
 * Spring Jpa のサービスクラス
 * @author maetaku
 */

@Service
public class ShoppingService {
	
	@Autowired
	ShoppingJpaRepository shoppingJpaRepository;
	
	/**
	 * 全件検索メソッド
	 *@return 全件
	 */
	
	public List<ShoppingList> findAll(){
		
		return shoppingJpaRepository.findAll();
	}
}
