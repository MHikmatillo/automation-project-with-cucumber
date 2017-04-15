package com.cbt;

import java.util.Scanner;

public class DemoTest {
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("hello again");
		
		
		for(int num=0 ; num<=100; num++){
			if(num%2==0){
				System.out.println(num);
				
				Scanner scan = new Scanner(System.in);  
			     
				  System.out.print("Input a number: ");  
				  int num1 = scan.nextInt();  
				     
				  for (int i=0; i< 10; i++){  
				   System.out.println(num1 + " x " + (i+1) + " = " +   
				     (num1 * (i+1)));  
				  }  
				
			}
		}
		
		
	}
}
