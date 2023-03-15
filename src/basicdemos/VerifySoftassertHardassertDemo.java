package basicdemos;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class VerifySoftassertHardassertDemo {

	public static void main(String[] args) {
		
		
		
		//hardAsset is a clas in testNg which have all non-static methods if the consdition is false then it wilnot excute next sattemnts
		int n1=65,n2=65,n3=75;
		//case1
		System.out.println("1");
		System.out.println("2");
	    Assert.assertEquals(n1, n2);
		System.out.println("3");
		System.out.println("4");
		
		
		//case2
				System.out.println("1");
				System.out.println("2");
			    Assert.assertEquals(n1, n3);
				System.out.println("3");
				System.out.println("4");
				
		
		
		
		
		//softAssert  is a class in testng which have all non static methods,condition is true or false it wil excute next statments 
		//case1
		/*SoftAssert softassert= new SoftAssert();
		System.out.println("1");
		System.out.println("2");
	    softassert.assertEquals(n1, n2);
		System.out.println("3");
		System.out.println("4");
		
		//case2
		SoftAssert softassert= new SoftAssert();
		System.out.println("1");
		System.out.println("2");
	    softassert.assertEquals(n1, n3);
		System.out.println("3");
		System.out.println("4");
		*/
		
		
		
	
		//verify station ==control statments
				//if condition is true or false it wil excute next statments 
	
		//case1
		/*if(n1==n2) {
			System.out.println("IF");
		}else{
			System.out.println("else");
		}
System.out.println("NIF");
	}
		//case2
		if(n1==n3) {
			System.out.println("IF");
		}else{
			System.out.println("else");
		}
System.out.println("NIF");	
		
*/
}}
