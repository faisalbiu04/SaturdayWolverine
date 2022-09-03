package com.upskill.java_2;

import java.lang.invoke.MethodType;

public class Methodtype {
	/* type of Methods
	 
	 1 void method
	 2 static method
	 3 return type method*/
	

public static int hourlyIncome = 75;	
	
	
	public static void main(String[] args) {
	Methodtype myObj = new Methodtype();
	myObj.annualIncomeVoid();

	weeklyIncomeStatic();
	
	System.out.println("My monthly Income = " + myObj.monthlyIncomeReturn());
	
}
//void method
	public static void annualIncomeVoid (){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome );
	}
// static method
	public static void weeklyIncomeStatic(){
		int calculateweeklyIncome = hourlyIncome *40;
		System.out.println("My Weekly Income ="+calculateweeklyIncome);
} 
	
// return type method 
	public int monthlyIncomeReturn(){
int calculatemonthlyIncome = hourlyIncome * 180;
return calculatemonthlyIncome;
	}}
