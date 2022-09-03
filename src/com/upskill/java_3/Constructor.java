package com.upskill.java_3;

public class Constructor {
	
	String admin;
	int adAge;
	
	public Constructor(String name,int age){
		admin = name;
		adAge =age;
		
	}

	public static void main(String[] args) {
		Constructor myObj = new Constructor("zainal",35);
		
		System.out.println(myObj.admin);
		System.out.println(myObj.adAge);

	}
}

