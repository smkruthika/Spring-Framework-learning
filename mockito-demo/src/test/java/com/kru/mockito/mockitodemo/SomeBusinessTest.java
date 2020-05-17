package com.kru.mockito.mockitodemo;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class SomeBusinessTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;
	
	@Test
	public void testFindGreatest() {
		
//		Replaced by line#17, 18
//		DataService dataServiceMock = mock(DataService.class);
		
		int[] arr = new int[3];
		when(dataServiceMock.retrieveAllData()).thenReturn(arr);
		
		//Replace by line#20, 21
//		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		
		int res = someBusinessImpl.findGratestFromAllData();
		assertEquals(24, res);
	}

}
