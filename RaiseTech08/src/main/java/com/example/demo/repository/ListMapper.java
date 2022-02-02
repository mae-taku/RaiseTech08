package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.SearchRequest;
import com.example.demo.entity.ShoppingList;

@Mapper
public interface ListMapper {
	
    public List<ShoppingList> selectAll();
    
    public ShoppingList selectOne(SearchRequest sr);
    
    public void insertOne(ShoppingList list);
}
