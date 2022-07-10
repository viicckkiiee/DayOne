package com.testngdemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.today.LibGlobal;

public class Demo1 extends LibGlobal {
	
	int count = 0;
	@Test()
	private void method1() {
		count++;
		if(count<=2)
		Assert.assertTrue(false);

//		getDriver();
//		loadUrl("https://www.facebook.com/");
//		WebElement txtUsername = findElementById("email");
//		jsHighlight(txtUsername)		
	}

	@Test()
	private void method2() {
		count++;
		if(count<=2)
		Assert.assertTrue(false);
		
	}
	
//	@Test(groups="@smoke")
//	private void method3() {
//		System.out.println("method3");
//	}
	
//	@DataProvider
//	private Object[][] getData() {
//		return new Object[][] {
//			{"https://www.google.com","gsw"},
//			{"https://www.google.com","csk"},
//			{"https://www.google.com","nadal"}
//				
//		};
//		
//	}
}
