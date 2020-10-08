import java.util.Scanner;

public class convertirNotas {
     public static void main(String[] args) {

    //Crear un programa que convierta notas numeras a notas alfabeticas
    // Ej: Un 6 seria un bien
    // Un 9 seria un sobresaliente.
         System.out.println("Conversor de notas.");
         System.out.println("Por favor, introduzca una nota a compartir: ");

         Scanner input = new Scanner (System.in);
         double nota = input.nextDouble();

         if (nota < 5) {
             System.out.println("Insuficiente.");

         }
         else if (nota <6) {
             System.out.println("Aprovado.");
         }
         else if(nota <7){
             System.out.println("Suficiente.");
         }
         else if(nota < 9) {
             System.out.println("Notable.");

         }
         else if(nota <= 10) {
             System.out.println("Sobresaliente.");
         }
     }
}
