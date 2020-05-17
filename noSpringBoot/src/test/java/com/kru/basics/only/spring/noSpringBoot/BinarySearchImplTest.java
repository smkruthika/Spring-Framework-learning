package com.kru.basics.only.spring.noSpringBoot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=NoSpringBootApplication.class)
public class BinarySearchImplTest {

	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	public void test() {
		int res = binarySearchImpl.binarySearch(new int[] {}, 5);
		assertEquals(3, res);
	}

}
