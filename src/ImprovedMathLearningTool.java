import java.util.Scanner;
//
public class ImprovedMathLearningTool {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
        int numberA = (int) (Math.random() *10);
        int numberB = (int) (Math.random() *10);
        int correctAnswer = numberA >= numberB ? numberA - numberB : numberB - numberA;
        System.out.println("Bienvenido a Problemas matematicos.");
        System.out.println("Introduce la solucion a la siguiente question: ");

        if (numberA >= numberB) {

            System.out.println((numberA  + "-" +  numberB));
            int enterAnswer = input.nextInt();
            if  (enterAnswer == correctAnswer) {
                System.out.println("Tu respuesta es correcta!");
                }
            else System.out.println("Tu respuesta es incorrecta");

        }
        else 
            System.out.println((numberB   +"-" +  numberA));
            int enterAnswer = input.nextInt();
            if  (enterAnswer == correctAnswer) {
                System.out.println("Tu respuesta es correcta!");
                }
            else System.out.println("Tu respuesta es incorrecta");
    } 
}
