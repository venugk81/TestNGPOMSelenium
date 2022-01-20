package com.utils;

import org.openqa.selenium.WebDriver;

class Animal {
	int a = 10;
	String Testing="";
	String driver= "null text";
	
	
	public void ini(){
		driver= "driver initialized";
	}
	
	Animal(){
		a= 20;
		System.out.println("I am in Animal class constrc...");
	}
	
	public void bark() {
		a = 30;
		Testing ="hey there!";
		ini();
		System.out.println("Dog barks: "+ a);
		
	}	
}

//			Animal
//			
//	Dog extends Animal
//	TestEg extends Animal

class Dog extends Animal{
	int b = 10;
	String driver;
	
	Dog(String _driver){
		driver= _driver;
	}
	
	Dog(){
		b= 20;
		System.out.println("I am in dog class constrc...");
	}
	
	public void bow() {
		b = 30;
		System.out.println("Dog barks: "+ b);
	}	
	
	public void driverValueFromDog() {
		System.out.println(driver);
	}
}

public class TestEg extends Animal{
	public static void main(String[] args) {
		TestEg t = new TestEg();
		t.bark();
		t.a=50;
		System.out.println(t.a);
		
		Dog d = new Dog();
		System.out.println(d.a);
		d.bow();
		System.out.println("d.Testing: "+ d.Testing);
		System.out.println("t.Testing: "+ t.Testing);
		System.out.println(t.driver);		//initialized.. 
		
		System.out.println(d.driver);			//null
		
		Dog d1= new Dog(t.driver);
		System.out.println(" Dog using parameterized constructor: "+d1.driver);
		
		
		
		
	}
}
