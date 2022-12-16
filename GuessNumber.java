import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pin = 9595;
		int flag = 0;
		int pass;
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Enter password : ");
			pass = sc.nextInt();
			
			if(pass == pin)
			{
				flag = 1;
				System.out.println("Correct. Welcome back.");
				break;
			}
			
			System.out.println("Incorrect! Try again.");
		}
		
		if(flag == 0)
		{
			System.out.println("Sorry! but you have been locked out.");
		}
		

	}

}
