package cop2805;

import java.util.Scanner;

public class ThreadFib{
	
	
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("How many numbers would you like to calculate to?");
		  //Insert the number for the scanner to calculate both formulas of Dynamic and Recursive
		  int n = scanner.nextInt();
		DynamicFib fn = new DynamicFib();
		RecursiveFib rn = new RecursiveFib();
		//For Dynamic start the timer in nanoseconds 
		long startTimeDynamic = System.nanoTime(); 
		//Calculate Dynamic
		fn.calculate(n);
		//Stop timer in nanoseconds
		long endTimeDynamic = System.nanoTime(); 
		//Print out the run time for the dynamic formula in nanoseconds 
		System.out.println("The run time for Dynamic is: " + (endTimeDynamic - startTimeDynamic));
		//For Recursive start the timer in nanoseconds 
		long startTimeRecursive = System.nanoTime(); 
		//Calculate Recursive
		rn.calculate(n);
		//Stop timer in nanoseconds
		long endTimeRecursive = System.nanoTime(); 
		//Print out the run time for the recursive formula in nanoseconds 
		System.out.println("The run time for Recursive is: " + (endTimeRecursive - startTimeRecursive));
	}
	//They dynamic formula of Fibonacci 
	static class DynamicFib{
		 public int calculate(int n) { 
			  int x = 0;
			  int y = 1;
			  int z = 0;
			  for(int i = 2; i <=n; i++)
			  {
				 z = x + y;
				 x = y;
				 y = z;
			  }
			  return z;
			  
			  
		  }
		
	}
	//the recursive formula of Fibonacci 
	static class RecursiveFib {
		public int calculate(int n) {
			  if(n == 0)
			  {
				  return 0;
			  }
			  if(n == 1)
			  {
				  return 1;
			  }
			  return calculate(n-1) + calculate(n-2);
			  
		  }
		
		  
	}
}
	




	
	
