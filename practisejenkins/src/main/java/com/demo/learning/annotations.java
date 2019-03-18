package com.demo.learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	
	
	@BeforeSuite
	public void suite()
	{
		System.out.println("Beforesuite");
	}
	
	
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("Beforesuite");
	}
	
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Beforeclass");
	}
	
	
   @AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
   
   @BeforeTest
   public void beforetest()
   {
	   System.out.println("beforetest");
   }
   
   @AfterTest
   public void Aftertest()
   {
	   System.out.println("Aftertest");
   }
   
   @Test(priority=1)
   public void test1()
   {
	   System.out.println("test1");
   }
   
   @Test(priority=2)
   public void test2()
   {
	   System.out.println("test2");
   }
   
   
   @BeforeMethod
   public void Beforemethod()
   {
	   System.out.println("Beforemethod");
   }
   
   @AfterMethod
   public void Aftermethod()
   {
	   System.out.println("Aftermethod");
   }

}
