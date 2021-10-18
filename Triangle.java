package javaassign;

public class Triangle {
	public static void main(String[] args)  
	{ 
		int num=5;
	for (int i = 0; i <= 4; i++)   
	{   
	for (int j = 8; j > i; j--)  
	{  
	System.out.print(" ");  
	}  
	for (int k = 0; k <= i; k++)  
	{  
	System.out.print(num+k +" ");  
	}  
	System.out.println();  
	}  
	}  

}
