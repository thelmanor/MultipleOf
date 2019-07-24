import java.util.*;
import java.lang.*;
import java.io.*;



/* 	Problem #1


If we list all the natural numbers less than 10 which are multiples of 3 or 5,
 	we get 3, 5, 6, 9.  The sum of these multiples is 23.Write a function which returns the 
	sum of all multiples of 3 or 5 less than X, where X is an integer parameter.
	
	by Thelma Nora

	07/20/2019


*/



class MultiplesOf

{

	public static void main (String[] args) throws java.lang.Exception{

			multiplesOf();

	}


	public static void multiplesOf(){


		Scanner in = new Scanner(System.in);


		int X = in.nextInt();


		int sum3=0;


		int sum5=0;

		
		//loop to generate sum of all multiples of 3 less than X

		for (int i = 3; i <X; i += 3){
	 
			sum3+= i;

		} 

		
		for (int i = 5; i <X; i += 5){ 

			sum5+= i;

		}
		
		// function to calculate the sum of all multiples of 3 or 5 less than X

		
		int total=sum3+sum5;


		System.out.println("The sum of all multiples of 3 or 5 less than" + " " + X + " " + "is =" + " " + total);


	}

}