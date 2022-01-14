package com.example.demo.Repository;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.example.demo.Form.BoughtListForm;

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
class BoughtMapperTest {
	
	@Autowired
	BoughtMapper target;
	
	@Test
	void 全件検索() {
	
		List<BoughtListForm> actual = target.selectAll();
		
		assertThat(actual.size()).isEqualTo(1);
	}

}
