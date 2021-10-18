package javaassign;

public class Firstprime {
	static void print_primes_till_N(int N)
	{
	    int i, j, flag;
	    System.out.println("Prime numbers between 1 and "
	                                      + N + " are:");
	 
	  
	    for (i = 1; i <= N; i++)
	    {
	        if (i == 1 || i == 0)
	            continue;
	 
	        // flag variable to tell
	        // if i is prime or not
	        flag = 1;
	 
	        for (j = 2; j <= i / 2; ++j)
	        {
	            if (i % j == 0)
	            {
	                flag = 0;
	                break;
	            }
	        }
	 
	        if (flag == 1)
	            System.out.print(i + " ");
	    }}
	 
	public static void main (String[] args)
	{
	    int N = 100;
	 
	    print_primes_till_N(N);
	}
}