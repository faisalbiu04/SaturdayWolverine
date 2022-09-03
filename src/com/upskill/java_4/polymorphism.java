package com.upskill.java_4;

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car();
		car(4);
		car(2,4);
		car("Red");
		
       weeklyIncomeStatic();
	}

	public static void car(){
		System.out.println("My car is audi !");
		
	}
	
	public static void car(int door){
		System.out.println("My car is audi, it has door : " + door);
   }
	
	public static void car(int door, int wheel){
		System.out.println("My car is audi, it has door : " +door  +"wheel :"+ wheel);
		
	}
	
	public static void car(String color){
	
		System.out.println("My car is audi it has color : "+ color);
	}
	
	public static void weeklyIncomeStatic(){
	    int hourlyIncome = 70;
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
		
		int businessIncome = 2000;
		int newIncome = calculateWeeklyIncome + businessIncome;
		System.out.println("My Weekly Income including Business = " + newIncome);
	}


}
	


