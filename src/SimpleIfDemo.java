import java.util.Scanner;
// introducir 3 numeros enteros
// mostrarlos de forma de mayor a menor

public class SimpleIfDemo {

    public static void main(String[] args) {

    //    System.out.println("Introduzca un numero: ");
    //    Scanner input = new Scanner (System.in);

        int a = (int) (Math.random() *100);
        int b = (int) (Math.random() *100);
        int c = (int) (Math.random() *100);

        System.out.println("Los numeros generados son: " + a + ", " + b + ", " + c + ".");

        
        if(a > b && c > a) {
            System.out.println(c +", " + a +", " + b);
        }
        else if (a > c && c > b){
            System.out.println(a +", " + c +", " +b);
        }
        else if (b > a && a > c) {
            System.out.println(b +", " + a +", " + c);

        }
        else if(c > b && b > a) {
            System.out.println(c +", " + b +", " + a);

        }
        else if (a > b && b > c) {
            System.out.println(a +", " + b +", " + c);

        }
        else  System.out.println(b + ", " + c +", "  + a);
    }
}
