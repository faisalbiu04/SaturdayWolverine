package com.upskill.java_2;

public class ifelsestatement {
 static int  age =75;
 
	public static void main(String[] args) {
		age();

	}
	public static void age(){
		
	if ( age < 13 ){
		System.out.println("you are children");
	} else if( age > 13 && age < 18 ){
		System.out.println("you are teenager");
	} 
{
		if(age>100){
			System.out.println("you are hero");
		}
		System.out.println("you are senior citizen");
	
	} else { 
		System.out.println("you are adult");
	}
	
}

	
}