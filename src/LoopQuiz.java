import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		int a = (int) (Math.random()* 10);
		int b = (int) (Math.random()* 10);
		int Resultado = (int)(a + b);
		System.out.println("Bienvenido a Quiz!");
		System.out.println("Responde a la siguiente pregunta: ");
		System.out.println("�Cuanto es " + a +"+"+ b +"? ");
		
		int EnterResultado = 0;
		EnterResultado = input.nextInt();
		int intentos = 0;
		while (EnterResultado != Resultado) {
			System.out.println("Tu respuesta no es correcta, intentalo de nuevo");
			EnterResultado = input.nextInt();
			intentos ++;
		}
		
		if(intentos <= 1) {
			System.out.println("Has acertado sin fallar ninguna vez");
		} else System.out.println("Has acertado pero has tenido " + intentos + " fallos.");
	}

}
