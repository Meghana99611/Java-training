package day3;
import java.util.Scanner;

public class Prgm7 {
	public static void main(String args[]){  
		  int i,fact=1,number; 
		  System.out.println("enter a number");
		  Scanner sc=new Scanner(System.in);
		  number = sc.nextInt();   
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		}  
