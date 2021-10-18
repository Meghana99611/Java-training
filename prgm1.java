package day3;

public class prgm1 {

	public static void main(String[] args) {
		int num = 3553, reversedNum = 0, remainder;
	    
	    int oNum = num;
	   
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num =num/10;
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (oNum == reversedNum) {
	      System.out.println(oNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(oNum + " is not Palindrome.");
	    }
	}

}
