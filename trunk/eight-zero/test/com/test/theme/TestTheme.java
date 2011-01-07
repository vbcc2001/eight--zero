package com.test.theme;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bbs.service.ThemeService;

public class TestTheme {

	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_*.xml");
	ThemeService themeService = (ThemeService) applicationContext.getBean("themeService");

	@Test
	public void testDeleteTheme() {
		fail("Not yet implemented");
	}

	@Test
	public void testIncreaseTheme() {
		fail("Not yet implemented");
	}

	@Test
	public void testModifyThreme() {
		fail("Not yet implemented");
	}
}
