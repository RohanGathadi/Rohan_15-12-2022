import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int firstNum, secondNum;
		
		// accepting two numbers from user
		System.out.println("Enter First number : ");
		firstNum = sc.nextInt();
		System.out.println("Enter second number larger than first : ");
		secondNum = sc.nextInt();
		
		// declaring required variables for the program
		int odd = firstNum;
		int oddSum = 0;
		int even = firstNum;
		int evenSum = 0;
		
		// 
		if(firstNum < secondNum)
		{
			// For even numbers
			System.out.println("Even numbers are : ");
			while(even <= secondNum)
			{
				if(even % 2 == 0)
				{
					System.out.print(even + " ");
					evenSum = evenSum + firstNum;
				}
				even ++;
			}
			System.out.println("The sum of all even numbers : " + evenSum);
			
			// For odd numbers
			System.out.println("Odd numbers are : ");
			while(odd <= secondNum)
			{	
				if(odd % 2 != 0)
				{
					System.out.print(odd +  " ");
					oddSum = oddSum + firstNum;
				}
				odd ++;
			}
			System.out.println("The sum of all odd numbers : " + oddSum);
			
		}		
		else 
		{
			System.out.println("Enter first number smaller than second.");
		}
	}
}