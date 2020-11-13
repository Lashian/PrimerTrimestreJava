import java.util.Scanner;
public class Fibonnacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Which term of Fibonacci series do you want");
		int n = input.nextInt();
		System.out.println("Your term: " + fibonacci(n));
	}

	public static int fibonacci(int n) {
		int first = 0;
		int second = 1;
		int third = 0;
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		for (int i = 3; i <= n; i++) {
			third = first + second;
			first = second;
			second = third;
		}
		return third;
	}
}
