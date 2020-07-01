/**
 * 
 */
package com.industry;
import java.util.*;
public class ManufactureSystem {

	/*
	  parent class
	 */
	private String company,name;
	public ManufactureSystem(String company,String name) {
		// parameter constructor
		this.company=company;
		this.name=name;//reference to class variable
	}
	public String getCompanyName() {
		return company;//returing the name of manufacturing system
	}
	public String getName() {
		return name;//returing the name of model
	}
   
     void steering(String type)
     {
    	 System.out.println("type of steering:"+type);
     }
     void color(String colour) {
     System.out.println("color of car:"+colour);
    
     }
}
class Car extends ManufactureSystem{
	String colour,name,company;
	 Car(String company,String name) {
		super(company,name);//calling parent class getName() method
	}
	void color(String Colour) {
		super.color(Colour);//calling parent class color() method
	}
	public void steering(String type)
     {
    	 super.steering(type);
     }
}
class Bus extends ManufactureSystem{
	String colour,name,company;
	 Bus(String company,String name) {
		super(company,name);
	}
	 public void color(String colour) {
		super.color(colour);
			}
	public void steering(String type)
     {
    	 super.steering(type);
     }
}
class Main{
	public static void main(String args[]) {
	String choice;
	
	try {
		
	
	Scanner abc = new Scanner(System.in);
	
	System.out.println("enter your choice:");
	choice=abc.next();
	switch(choice)
	{
		case "car":
			Car obj=new Car("maruthi","dzire");
			System.out.println("Company:"+obj.getCompanyName()+"\nModel:"+obj.getName());
			obj.color("red");
			obj.steering("power steering");
			break;
		case "bus":
			Bus obj1=new Bus("tata","marcopolo"); 
			System.out.println("Company:"+obj1.getCompanyName()+"\nModel:"+obj1.getName());
			obj1.color("white");
			obj1.steering("power steering");
			break;
		default:
			System.out.println("wrong choice");
			break;
	
}
	}catch(Exception abc){
		System.out.println("scanner class input not closed");
	}
	
	}
}