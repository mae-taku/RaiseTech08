package com.example.demo.service;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.ShoppingList;

@SpringBootTest
class ShoppingServiceTest {

	@Autowired
	ShoppingService target;
	
	@Test
	void 全件出力_8件あることを確認() {
		System.out.println("*** JDBC READ Test started. ***");
		
		//全件検索
		List<ShoppingList> actual = target.findAll();
		System.out.println("全件データ数； " + actual.size());
		
		//全件＝8件あることを確認。
		assertThat(actual.size()).isEqualTo(8);
		
		System.out.println("*** JDBC READ Test ended. ***");
	}

}
