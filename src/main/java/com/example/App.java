package com.example;

public class App 
{
    public static void main( String[] args )
    {
        int number = 5;
	System.out.printf("%d! = %d", number, factorial(number));
    }

    private static int factorial(int n) {
	
	if (n == 0) {
		return 1;
	}
	return n * factorial(n - 1);
    }
}
