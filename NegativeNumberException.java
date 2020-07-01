package com.exception;
import java.util.Scanner;
 class NegativeNumberException extends Exception{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NegativeNumberException() {
		System.out.println("negative number exception");
	}

}
 class MainClass {
	  public static void main(String[] args) {
 		int num;
 	Scanner n=new Scanner(System.in);
 	System.out.println("enter number:");
 		num=n.nextInt(); 
        n.close();
 		
 		try {
 		 if(num<0)
 			throw new NegativeNumberException();
 		 else
 			System.out.println("Sucessfull result");
 		}
 		catch(Exception e) {
 			System.out.println(e);
 			}
 		
 	}

 }
