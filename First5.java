package javaapplication;
import java.util.Scanner;

public class First5 {
	public static void main(String[] args) {
		 int i,n;

		    System.out.print("Input number of terms : ");
		    Scanner in = new Scanner(System.in);
				    n = in.nextInt();

		   for(i=1;i<=n;i++)
		     {
		    	 System.out.println(" cube of " +i+" is : "+(i*i*i));         
		    }
		 }
		}