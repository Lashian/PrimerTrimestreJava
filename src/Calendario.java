import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.println("Enter full year: ");
		int year = input.nextInt();
		int month;
		do {
		System.out.println("Enter month: ");
		month = input.nextInt();
		} while(month >= 1 && month < 13);
		
		
		System.out.println("\t\t\t");
		System.out.println("");
		
	}
	

	
	public static String getMonthName(int n) {
		String mes = "";
		switch(n) {
		case 1: mes = "January"; break;
		case 2: mes = "February"; break;
		case 3: mes = "March"; break;
		case 4: mes = "April"; break;
		case 5: mes = "May"; break;
		case 6: mes = "June"; break;
		case 7: mes = "July"; break;
		case 8: mes = "August"; break;
		case 9: mes = "September"; break;
		case 10: mes = "October"; break;
		case 11: mes = "November"; break;
		case 12: mes = "December"; break;
		}
		return mes;
}
	
	
}
