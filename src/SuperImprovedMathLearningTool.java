import java.util.Scanner;
// POR TERMINAR
public class SuperImprovedMathLearningTool {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		/*Scanner input = new Scanner (System.in);
        int a = (int) (Math.random() *10);
        int b = (int) (Math.random() *10);
        int CorrectAnswer = a >= b ? a - b : b - a;
        int i = 0;
        int Aciertos = 0;
        int Fallos = 0;
        System.out.println("Bienvenido a Problemas matematicos.");
        System.out.println("Introduce la solucion a la siguiente question: ");

        int EnterAnswer = 0;
       
        System.out.println("Cuanto es " +a  + (-b) + "?"); 
        EnterAnswer = input.nextInt();
        while (i <4 && EnterAnswer == CorrectAnswer) {
        	System.out.println("Has acertado");
        	System.out.println("Cuanto es " +a +  (-b) + "?");
        	EnterAnswer = input.nextInt();
        	Aciertos++;
        	i++;
        		while(i <4 && EnterAnswer != CorrectAnswer) {
        		System.out.println("No has acertado");
        		System.out.println("Cuanto es " +a +  (-b) + "?");
            	EnterAnswer = input.nextInt();
            	Fallos++;
            	i++;
        		}
        } 
        System.out.println("Has obtenido: " + Aciertos + "aciertos y "  + Fallos + " fallos.");
       */
        
        
        /*RAUL*/
        Scanner input = new Scanner (System.in);
        final int NUMERO_TOTAL_PREGUNTAS = 5;
        int aciertos = 0;
 /*      //int index = 1;
        
        while(index <= NUMERO_TOTAL_PREGUNTAS) {
        	 int a = (int) (Math.random() *10);
             int b = (int) (Math.random() *10);
             int correctAnswer = a >= b ? a - b : b - a;
             String operation = a >= b ?  a +"-"+ b  :  b +"-"+ a;
             String msg = "Cuanto es " + operation + "?";
        	 System.out.println(msg);        
        	 int resp = input.nextInt();
        	
        	 if(resp == correctAnswer) aciertos++;
        	
        	index++;
        }*/
        
        for(int index = 1; index <= NUMERO_TOTAL_PREGUNTAS; index++) {
        	 int a = (int) (Math.random() *10);
             int b = (int) (Math.random() *10);
             int correctAnswer = a >= b ? a - b : b - a;
             String operation = a >= b ?  a +"-"+ b  :  b +"-"+ a;
             String msg = "Cuanto es " + operation + "?";
        	 System.out.println(msg);        
        	 int resp = input.nextInt();
        	
        	 if(resp == correctAnswer) aciertos++;
        }
        
        System.out.println("Has obtenido " + aciertos + " aciertos y "+ (NUMERO_TOTAL_PREGUNTAS - aciertos) +" fallos.");
        
        
        
        
        
    } 
}
