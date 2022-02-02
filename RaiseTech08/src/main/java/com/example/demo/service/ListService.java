package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SearchRequest;
import com.example.demo.entity.ShoppingList;
import com.example.demo.repository.ListMapper;

@Service
public class ListService {
	
	@Autowired
	private ListMapper mapper;
    
    public List<ShoppingList> getList() {
        return mapper.selectAll();
    }

    public ShoppingList details(SearchRequest sr) {
        return mapper.selectOne(sr);
    }
    
    public void insertOne(ShoppingList list) {
        mapper.insertOne(list);
    }
}
