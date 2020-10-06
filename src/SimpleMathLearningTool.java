import java.util.Scanner;

public class SimpleMathLearningTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int numberA = (int)(Math.random()*10);


		int numberA = (int) (Math.random() *10);
		int numberB = (int) (Math.random() *10);
		
		System.out.println("Bienvenido a Problemas matematicos.");
		System.out.println("Introduce la solucion a la siguiente question: ");
		System.out.print(numberA +"+"+ numberB +": ");
		
		Scanner input = new Scanner (System.in);
		int enterAnswer = input.nextInt();
		
		System.out.println("La solucion es " + (enterAnswer == (numberA + numberB)));
		
/*		if (enterAnswer) {
			System.out.println("Tu respuesta es correcta");
			}
				else System.out.println("Tu respuesta es incorrecta."); */
	}
}



