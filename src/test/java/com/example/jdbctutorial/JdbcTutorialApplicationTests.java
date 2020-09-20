package com.example.jdbctutorial;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class JdbcTutorialApplicationTests {

	@Autowired
	private MovieRepository movieRepository;

	@Test
	void contextLoads() {
		Set<Rental> r1 = new HashSet<Rental>();
		Set<Rental> r2 = new HashSet<Rental>();

		r1.add(new Rental(Duration.ofDays(1), 2));
		r2.add(new Rental(Duration.ofDays(2), 3));
		r2.add(new Rental(Duration.ofDays(7), 10));

		Movie m1 = new Movie(null, "m1", "ssss", r1);
		Movie m2 = new Movie(null, "m2", "aaaa", r2);

		System.out.println(movieRepository.save(m1));
		System.out.println(movieRepository.save(m2));

		System.out.println(movieRepository.findAll());

		m1.setTitle("Matrix 2");

		movieRepository.save(m1);
		System.out.println(movieRepository.findAll());

	}

}
