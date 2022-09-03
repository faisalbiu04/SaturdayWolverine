package com.upskill.java_5;

public class Encapsulation {
//Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill"; //write & read only
	private int ssn =1234561;//write only
	private String username ="raselalam"; // read only
	
	
	// Setter Method-name
	public void setName(String value){   // set the data
		 name = value;
	}
	// getter Method-name
	
	public String getName(){
		return  name;
	}
	// Setter Method-ssn
	public void setSSN(int value){
		ssn= value;
	}
	//Getter Method- username
	public String getUserName(){
		return username;
	}
	public static void main(String[] args) {
		Encapsulation obj =new Encapsulation();
		obj.setName("Rasel");
		obj.getName();
		obj.setSSN(1234561);
		obj.getUserName();
		System.out.println(obj.getName());
		
		

	}

}
