import java.util.Scanner;
// POR TERMINAR
public class SuperImprovedMathLearningTool {

    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el numero de preguntas que quieres resolver:");
        int numeroPreguntas = input.nextInt();
        int aciertos = 0;
        long empiezaTiempo = System.currentTimeMillis();
        long terminaTiempo = System.currentTimeMillis();
        
        for(int index = 1; index <= numeroPreguntas; index++) {
        	 int a = (int) (Math.random() *10);
             int b = (int) (Math.random() *10);
            
             int correctAnswer = a >= b ? a - b : b - a;
             String operacion = a >= b ?  a +"-"+ b  :  b +"-"+ a;
             System.out.println();
             System.out.println("Pregunta numero: " + index);
             System.out.println("Resuelve la siguiente operacion: ");
             //TEST Metiendo "print" dentro de un String TEST
             String mensaje = "Cuanto es " + operacion + "?";
        	 System.out.println(mensaje);        
        	 int respuesta = input.nextInt();
        	
        	 if(respuesta == correctAnswer) 
        		 aciertos++;
        	 
        }
        //Falta arreglar el tiempo empleado
         terminaTiempo = System.currentTimeMillis();
        System.out.println("Has obtenido " + aciertos + " aciertos y "+ (numeroPreguntas - aciertos) +" fallos.");
        if (aciertos >= (numeroPreguntas - aciertos)) {
        	System.out.println("Enhorabuena, has aprobado. Has tardado: " + ((terminaTiempo - empiezaTiempo )) + " segundos" );
        } else System.out.println("Lo sentimos, has suspendido." + ((terminaTiempo - empiezaTiempo )) + " segundos" );
    } 
  }

