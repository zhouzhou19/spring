package com.manoj.springbootneo4jexample1;

import com.manoj.springbootneo4jexample1.model.Movie;
import com.manoj.springbootneo4jexample1.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootNeo4jExample1ApplicationTests {

	@Test
	public void contextLoads() {
		Movie m1 = new Movie("1","无问西东", "z");
		Movie m2 = new Movie("2","罗曼蒂克消亡史", "z");
	}

}
