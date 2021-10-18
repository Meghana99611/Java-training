package javaapplication;
import java.util.Scanner;

public class Cmpare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 
		  System.out.print("Enter 1st number: ");
		  int num1 = in.nextInt();
		 
		  System.out.print("Enter 2nd number: ");
		  int num2 = in.nextInt();
		 
		  System.out.print("Enter 3rd number: ");
		  int num3 = in.nextInt();
		 
		 
		  if (num1 > num2)
		   if (num1 > num3)
		    System.out.println("The greatest: " + num1);
		 
		  if (num2 > num1)
		   if (num2 > num3)
		    System.out.println("The greatest: " + num2);
		 
		  if (num3 > num1)
		   if (num3 > num2)
		    System.out.println("The greatest numbers is : " + num3);
	}

}
