package com.example.usercenter;


import com.example.usercenter.mapper.UserMapper;
import com.example.usercenter.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringBootMybatisPlusTemplateApplicationTests {

	@Test
	void contextLoads() {
	}

	@Resource
	private UserMapper userMapper;

	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
		List<User> userList = userMapper.selectList(null);
//		Assert.assertEquals(5, userList.size());
		userList.forEach(System.out::println);
	}
}
