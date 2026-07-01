package com.example.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void mainMethodTest() {
		BlogApplication.main(new String[] {});
	}
}