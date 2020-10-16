import java.util.Scanner;

public class OperacionesSegundoGrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b ,c;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Valor de a: ");
		a = input.nextInt();
		
		System.out.println("Valor de b: ");
		b = input.nextInt();
		
		System.out.println("Valor de c: ");
		c = input.nextInt();
		
		
		double d = Math.pow(b, 2) - 4 * a * c;
		if(d < 0 ) {
			System.out.println("No hay solucion.");
			
		} 
		else if(d == 0) {
			System.out.println("Una solucion: " + (-b/2*a));
		}
		else {
			double x1 = ((-b)+Math.sqrt(d))/2*a;
			double x2 = ((-b)+Math.sqrt(d))/2*a;
			System.out.println("Solucion: " +x1+"" +x2);
		}
	}

}
