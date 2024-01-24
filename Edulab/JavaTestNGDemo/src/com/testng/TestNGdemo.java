package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {

	


	@BeforeSuite
	public void a() {
		System.out.println("This is Beforesuite");	
	}
	
	@BeforeTest
	public void b() {
		System.out.println("This is BeforeTest");
	}
	@BeforeClass
	public void c() {
		System.out.println("This is BeforeClass");	
	}
	@BeforeMethod
	public void d() {
		System.out.println("This is BeforeMethod");
	}
	
	@Test
	public void e() {
		System.out.println("This is test cases1 ");
	}
	
	@Test
	public void ee() {
		System.out.println("This is Test cases2 ");
	}
	
	@AfterMethod
	public void f() {
		System.out.println("This is aftermethod");	
	}
	@AfterClass
	public void g() {
		System.out.println("This is afterclass");
	}
	@AfterTest
	public void h() {
		System.out.println("This is aftertest");
	}
	@AfterSuite
	public void i() {
		System.out.println("This is aftersuite");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
