package com.kiyson.boot;

import com.kiyson.boot.entity.User;
import com.kiyson.boot.mapper.auth.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

	private Logger logger = LoggerFactory.getLogger(BootApplicationTests.class);

	@Autowired
	UserMapper mapper;

	@Test
	public void contextLoads() {
		List<User> users = mapper.selectAll();
		for (User user:users) {
			System.out.println(user.toString());
		}
	}

}
