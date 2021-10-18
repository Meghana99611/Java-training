package newprgms;
import java.lang.*;
import java.util.Scanner;

public class Mirror {
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.print("enter the strig");
	StringBuffer str = new StringBuffer();
	StringBuffer rev = new StringBuffer();
	str.append(scan.nextLine());
	System.out.print(str);
	rev=str.reverse();
	System.out.print(" | " +rev);
	}
}
