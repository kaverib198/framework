package com.kavya.customizedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



//To create our own exception the class shld extends Exception class which will generate sum id
//it should have two constructors 

public class ExceptionDemo {

	//throws is a keyword which is applicable at method level it may b main method aslo
	//a single try block can have multple ctach blocks it shld have child to parent relation
	
	
	public static void main(String[] args) {
		//approach 1
		// FileInputStream fip=new FileInputStream("");//checked exception checked by the complier for smooth execution of program
		
		
		
		//1.6 and below 1.6 
		//whenever we get exception in try block crrossponding catch block wil b executed
		try {
			System.out.println("1");
			System.out.println("2");
			//FileInputStream fip = new FileInputStream("D:\\Nov830pm\\Framework\\Config.properties");
			FileInputStream fip = new FileInputStream("D:\\Nov830pm1\\Framework\\Config.properties");//here we are geting exception so it wil go to catch block and the lines after exception rest of the code is not gng to excetue in dat block
			System.out.println("3");
			System.out.println("4");
		} catch (FileNotFoundException e) {
			//to print exceptions we have 3 methos in throwable class
		//e.printStackTrace();
		//System.out.println(e.getMessage());
		//System.out.println(e.toString());
		System.out.println(e);
			System.out.println("catch block");
		}
	}

}
