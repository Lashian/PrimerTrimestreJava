import java.util.Scanner;
//
public class ComputingLoan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduzca la cantidad de dinero solicitada: ");
		int LoanAmount = input.nextInt();
		 
		 System.out.println("Introduzca el número de años que lo quiere pagar: ");
		 int Years = input.nextInt();
		 int Interest = ((1 * 100)/80)*12;
		 
		 double MonthlyPayment = LoanAmount * Interest / (1
			      - 1 / Math.pow(1 + Interest, Years * 12));
		 
		 System.out.println("Deberá de pagar " + (MonthlyPayment *100)/100.0 + "€");
		
		 /* double monthlyPayment = loanAmount * monthlyInterestRate / (1
      - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    double totalPayment = monthlyPayment * numberOfYears * 12;*/
	}

}
