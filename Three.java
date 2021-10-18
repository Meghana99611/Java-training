package javaapplication;
import java.util.Scanner;

public class Three {
		public static void main(String args[]) {
			System.out.println("hi");
			Scanner scan = new Scanner(System.in);
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			
			if(a>=b&&a>=c)
			{
				System.out.println(a+ "is bigger");
			}
			else if(b>=a&&b>=c)
					System.out.println(b+ "is bigger");
			
		else 
			System.out.println(c+ "is bigger");
			scan.close();
		}}
