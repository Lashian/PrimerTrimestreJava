import java.util.Scanner;

public class ImprovedMathLearningTool {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numberA = (int) (Math.random() *10);
        int numberB = (int) (Math.random() *10);
        int correctAnswer = numberA >= numberB ? numberA - numberB : numberB - numberA;
        System.out.println("Bienvenido a Problemas matematicos.");
        System.out.println("Introduce la solucion a la siguiente question: ");

 /*       String numerosString = numberA >= numberB ? numberA  + "-" +  numberB : numberB   +"-" +  numberA;
        int correctAnswer = numberA >= numberB ? numberA - numberB : numberB - numberA;
        System.out.println(numerosString);
        int enterAnswer = input.nextInt();
        System.out.println("La solucion es " + (enterAnswer == correctAnswer ? "correcta" : "incorrecta"));
   */

    //    System.out.println((numberA > +"-" +  numberB));


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