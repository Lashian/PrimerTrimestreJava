import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world");
		
		 
		 System.out.println("Please enter two numbers:");
		
		 Scanner input = new Scanner (System.in);
		 
		int a = input.nextInt();
		int b = input.nextInt();
		
		int c = a + b;
		
		System.out.println("Your number is: " + c);
		
		if (c > 50) {
			System.out.println("Your number is too high");
			}	
		else System.out.println("your number is ookay");
		}
}
