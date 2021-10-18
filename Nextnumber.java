package newprgms;

import java.util.Scanner;

public class Nextnumber {
	    static int sumOfDigit(int K)
	    {
	        int sod = 0;
	        while (K != 0)
	        {
	            sod += K % 10;
	            K /= 10;
	        }
	        return sod;
	    }
	     
	    // method returns count of numbers smaller than N,
	    // satisfying difference condition
	    static int totalNumbersWithSpecificDifference(int N, int diff)
	    {
	        int low = 1, high = N;
	      
	        //  binary search while loop   
	        while (low <= high)
	        {
	            int mid = (low + high) / 2;
	            if (mid - sumOfDigit(mid) < diff)       
	                low = mid + 1;
	            else      
	                high = mid - 1;       
	        }
	      
	        return (N - high);
	    }
	 
	    public static void main(String args[])
	    {
	    	int N;
	    	int diff=2;
	    	  Scanner in = new Scanner(System.in);
	           System.out.println("Enter a string");
	           N=in.nextInt();
	        System.out.println(totalNumbersWithSpecificDifference(N, diff));
	        }
}
	      /*  public static void main(String args[])
	        {
	            int N = 123;
	            int diff = 2;
	          
	            System.out.println(totalNumbersWithSpecificDifference(N, diff));
	        }
	    
	    }
	*/
