import java.util.Scanner;

public class ChinesseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Bienvenido, introduce tu año de nacimiento");
		int EnterYear = input.nextInt();
		int Zodiac = EnterYear %12;
		switch(Zodiac) {
			case 0: System.out.println("Tu signo del zodiaco chino es: 1");
			case 1: System.out.println("Tu signo del zodiaco chino es: 2");
			case 2: System.out.println("Tu signo del zodiaco chino es: 3");
			case 3: System.out.println("Tu signo del zodiaco chino es: 4");
			case 4: System.out.println("Tu signo del zodiaco chino es:5 ");
			case 5: System.out.println("Tu signo del zodiaco chino es: 6");
			case 6: System.out.println("Tu signo del zodiaco chino es:7 ");
			case 7: System.out.println("Tu signo del zodiaco chino es: 8");
			case 8: System.out.println("Tu signo del zodiaco chino es: 9");
			case 9: System.out.println("Tu signo del zodiaco chino es:0 ");
			case 10: System.out.println("Tu signo del zodiaco chino es:' ");
			case 11: System.out.println("Tu signo del zodiaco chino es: ¡");
			break;
		}
	}

}
