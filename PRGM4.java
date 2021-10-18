package day3;
import java.util.Scanner;

public class PRGM4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number "); 
		int number=sc.nextInt();
		System.out.print("Prime Factors are : " );
		        for (int i = 2; i <= number; i++) {
		 
		            while (number % i == 0) {
		                System.out.print(i + " ");
		                number = number / i;
		            }
		        }
		 
		        if (number < 1) 
		        	System.out.println(number);
		    }
	}

