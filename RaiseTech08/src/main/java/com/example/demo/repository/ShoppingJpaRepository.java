package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ShoppingList;

/**
 * @author maetaku
 *JpaRepositoryの継承クラス
 *JpaRepositoryには基本的CRUDメソッドが定義されている
 */
public interface ShoppingJpaRepository extends JpaRepository<ShoppingList, Integer>{

}
