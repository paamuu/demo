package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class DemoApplicationTests {
	@Value("${person.name}")
	private String name;

	@Autowired
	private Environment env;

	@Test
	void contextLoads() {
		System.out.println("通过@Value注解获取配置信息"+name);
		System.out.println(env.getProperty("person.age"));
	}

}
