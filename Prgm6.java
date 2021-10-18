package day3;
import java.util.Scanner;

public class Prgm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	

		for(i = number; i < 10; i++)
		{
			for(j = 1; j < 10; j++)
			{
				//System.out.println(i +"  *  " + j + "  =  " + i * j);
				System.out.println( + i * j);
			}
			System.out.println("================");
		}
	}}
