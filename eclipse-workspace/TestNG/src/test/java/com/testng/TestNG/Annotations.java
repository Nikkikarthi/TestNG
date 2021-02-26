package com.testng.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
     
	@BeforeSuite
	public void beforeSuite() {
       System.out.println("Before suite will execute before all test");
	}
	
	@BeforeTest
	public void beforeTest() {
      System.out.println("Before test will execute before all beforeclass");
	}
	
	@BeforeClass
	public void beforeClass() {
System.out.println("Before class will execute before all before method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
System.out.println("Before method will execute before each test");
	}
	
	@Test
	public void test1() {
System.out.println("Test 1:case 1");
	}
	
	@Test
	public void test2() {
System.out.println("Test 2:case 2");
	}
	
	@AfterMethod
	public void afterMethod() {
      System.out.println("After method will execute after each test");
	}
	
	@AfterClass
	public void afterClass() {
System.out.println("After class will execute after all after method");
	}
	
	@AfterTest
	public void afterTest() {
     System.out.println("After test will execute after all after class");
	}
	
	@AfterSuite
	public void afterSuite() {
 System.out.println("After suite will execute after all after test");
	}
	
}
