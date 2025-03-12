package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.MainApp;

public class MainForTest {
	@Test
	public void TestAddition() {
		MainApp service=new MainApp();
		int result=service.addition(8,8);
		assertEquals(16,result);
	}


}
