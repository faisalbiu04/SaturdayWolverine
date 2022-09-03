package com.upskill.java_3;

public class loops {
	/*
	type of loops
	1 .for loops
	2 .while loops
	3 . do while loops
	4. infinite loops
	5.
	*/
	
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		practiceForLoop();
		practiceWhileLoop();
		practiceDoWhileLoop();
		 practiceinfiniteLoop();
		 practiceNestedForLoop();
		 multipicationTable();
	}

	public static void practiceForLoop() {
		// TODO Auto-generated method stub
	 int  i;
	 for(i =1; i< 100; i++){
		 System.out.println("For Loops number=" +i);
	 }
	} 
	public static void practiceWhileLoop() {
		int i = 1;
		while(i<= 100) {
			System.out.println("While Loops Number="+i);
			i++;
		}
	}
	
	public static void practiceDoWhileLoop() {
      int i = 1;
      do {
    	  System.out.println("Do While Loops Number="+i);
			i++;
      } while(i<100);
	}
	
	public static void practiceinfiniteLoop() {
	      int i = 1;
	      for(i=1; ;i++){
	    	  System.out.println("Infinite Loops Number="+i);
				i++;
	      }
	}
	public static void practiceNestedForLoop(){										//Nested loop = loop inside another loop
		int i;																		//Initializing variable i
		int j;																		//Initializing variable j
		for (i=1;i<=10;i++){														//First loop for i
			for (j=1;j<=10;j++){													//Second loop for j
				System.out.println("Nested For Loops Numbers = " + i + ":" + j);	//Statement for j loop
			}
			System.out.println("Increase value of i -> " +i);						//Statement for i loop
		}
	}
	
public static void multipicationTable(){
	for(int row=1;row <=10; row++){
		for(int col=1;col<=10;col++){
			int table =row*col;
			System.out.println(table+"");
		}
			System.out.println("");
		}
	}
}







