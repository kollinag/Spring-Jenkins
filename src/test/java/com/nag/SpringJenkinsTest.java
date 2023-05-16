package com.nag;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringJenkinsTest {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsTest.class);
	
	@Test
	public void hai() {
		logger.info("hai");
		jjj
		assertEquals(true,true);
	}

}
