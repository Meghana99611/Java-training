package day3;
import java.util.Scanner;

public class S3pgm {
	static boolean checknumber(int n)
    {
        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
            == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
 
  
    public static void main(String[] args)
    {
    	int n;
    	System.out.print("enter a number ");
	    Scanner in = new Scanner(System.in);
			    n = in.nextInt();
    	System.out.println(checknumber(n));
    	
}}
 


