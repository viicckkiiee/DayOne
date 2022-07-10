package com.sample;

import org.testng.annotations.Test;

public class TestNGsample {

	@Test(priority=3)
	private void aa() {
		System.out.println("a");
	}
	@Test(priority=1)
	private void ab() {
		System.out.println("ab");
	}
	@Test(priority=-1)
	private void ac() {
		System.out.println("abc");
	}
	
}
