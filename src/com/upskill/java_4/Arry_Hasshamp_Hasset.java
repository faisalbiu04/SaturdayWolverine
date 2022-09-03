package com.upskill.java_4;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Arry_Hasshamp_Hasset {

	public static void main(String[] args) {
		// Array store Multipul data using index
		int age =30;// variable
		int[] agewolverin = new int[]{24,28,30,35,29,40};// Array
		// Array index [0][1][2][3][4][5]
		System.out.println("student age:"+ agewolverin[5]);
		System.out.println("total Students:" +agewolverin.length );
		
		String[]nameWolverin = new String[]{"ansarul","faisal","zainal","abul"};
		System.out.println("Student Name:" + nameWolverin[1]);
		
		// Multi_dimentional Array
		int[][]agewolverin2D ={{24,28,30,35,29,40},
				{35,22,28,27}};
		System.out.println("student age 2D:"+ agewolverin2D[0][3]);
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Ansarul", 28);
		Student.put("Omar", 25);
		Student.put("Rusdi", 27);
		Student.put("Sheikh", 30);
		Student.put("Liquath", 35);
		
		System.out.println("Student Age : " + Student.get("Omar"));		
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City : " + Capital.get("USA"));	
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>(); 
		
		car.add("BMW");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
		
		//HashTable store multipul data using key-value pair, but is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "North America");
		
		System.out.println("Region : " + Region.get("USA"));	
	}
		}
	}


