package day3;
import java.util.Scanner;

public class Prgm10 {
	public static void main(String[] args) {
		int x = 3;
		int y = 12;
		Fraction(x, y);
		}
		static void Fraction(int x, int y)
		{
		int d;
		d = gcd(x, y);
		x = x / d;
		y = y / d;
		System.out.println("x = " + x + ", y = " + y);
		}
		static int gcd(int a, int b)
		{
		if (b == 0)
		return a;
		return gcd(b, a % b);

		}
		
		}
