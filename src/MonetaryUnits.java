import java.util.Scanner;
//
public class MonetaryUnits {

    //Descomponer el numero de monedas que tenemos
    //Porejemplo si damos 724 MONEDAS DE UN CENTIMO
    //Obtendremos 3 monedas de 2 euros, una de 1 euros, una de 20 centimos
    //y una de 5 centimos

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Introduzca el numero de monedas de un centimo: ");

        int centimos = input.nextInt();
        
        int dosEuros = (centimos / 200); 
        centimos -= (dosEuros * 200); 
   //   centimos = centimos % 200;

        int unEuros = (centimos / 100); 
        centimos -= (unEuros * 100); 
        
        int cincuentaCentimos = (centimos / 50); 
        centimos -= (cincuentaCentimos * 50); 

        int veinteCentimos = (centimos / 20); 
        centimos -= (veinteCentimos * 20); 

        int diezCentimos = (centimos / 10); 
        centimos -= (diezCentimos * 10);

        int cincoCentimos = (centimos / 5);
        centimos -= (cincoCentimos * 5);

        int dosCentimos = (centimos / 2);
        centimos -= (dosCentimos * 2);

        int unCentimos = (centimos);


        System.out.println("Usted posee: ");
        System.out.println( + dosEuros + " monedas de dos euros");
        System.out.println( + unEuros + " monedas de un euro");
        System.out.println( + cincuentaCentimos + " monedas de cincuenta centimos");
        System.out.println( + veinteCentimos + " monedas de veinte centimos");
        System.out.println( + diezCentimos + " monedas de diez centimos");
        System.out.println( + cincoCentimos + " monedas de cinco centimos");
        System.out.println( + dosCentimos + " monedas de dos centimos");
        System.out.println( + unCentimos + " monedas de un centimos");

    }
}