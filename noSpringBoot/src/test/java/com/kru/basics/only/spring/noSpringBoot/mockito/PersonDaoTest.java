package com.kru.basics.only.spring.noSpringBoot.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonDaoTest {
	
	@Mock
	JdbcConnection jdbcConnection;
	
	@InjectMocks
	PersonDao personDao;

	@Test
	public void test() {
		when(jdbcConnection.getData()).thenReturn(1);
		assertEquals(1, personDao.printValue());
		
	}

}
