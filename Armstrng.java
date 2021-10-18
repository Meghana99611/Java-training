package javaassign;

import java.util.Scanner;

public class Armstrng {
	public static void main(String[] args) {

		int number;
        System.out.print("enter a number ");
        Scanner in = new Scanner(System.in);
        number=in.nextInt();
         int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

