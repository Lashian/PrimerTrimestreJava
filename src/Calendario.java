import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter full year - e.g.2004 :");
		int year = input.nextInt();
		int month;
		do {
			System.out.print("Enter month between 1 and 12 :");
			month = input.nextInt();
		} while (month < 1 || month > 12);
		
		System.out.println("\t\t\t\t"+getMonthName(month)+"   "+year);
		System.out.println();
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Sunday\tMonday\tTuesday\tWednes\tThurs\tFriday\tSaturday");
		
		printMonth(year,month);

	}

	public static void printMonth(int year,int month) {
		final int FIRST_DAY = 3;
		int numberOfDays = getNumberOfDays(month,year);
		int totalDays = getTotalDays (year,month);
		
		int firstDay = (totalDays + FIRST_DAY)%7;
		//System.out.println(firstDay);
		for (int space =1;space <firstDay;space++)//Imprime espacios hasta el primer dia
			System.out.print("\t");
		System.out.print(" ");
		for (int d = 1 ; d<=numberOfDays;d++) {
			System.out.print(d+"\t ");
		    if ((d+firstDay-1) %7 ==0)
		    	System.out.println("");
		}
		
	}
	public static int getTotalDays(int year,int m) {
		final int YEAR = 1800;
		int totalDays =0;
		for (int y=YEAR; y<year;y++)
			if (isLeapYear(y))
				totalDays += 366;
			else
				totalDays += 365;
		for (int mes =1; mes < m; mes++)
			totalDays += getNumberOfDays(mes,year);
		return totalDays;
	}
	public static int getNumberOfDays(int m,int year) {
		if ( m == 4 || m== 6 || m== 9 || m == 11)
			return 30;
		if (m == 2)
			if (isLeapYear(year))
				return 29;
			else
				 return 28;
		return 31;
	}
	public static boolean isLeapYear(int year) {
		if (year%4==0 && year%100!=0 || year%400==0)
			return true;
		return false;
	}
	public static String getMonthName(int m) {
		String mes="";
		switch (m) {
			case 1: mes= "January";break;
			case 2: mes= "February"; break;
			case 3: mes= "March"; break;
			case 4: mes= "April";break;
			case 5: mes= "May";break;
			case 6: mes= "June";break;
			case 7: mes= "July";break;
			case 8: mes= "August";break;
			case 9: mes= "September";break;
			case 10: mes= "October";break;
			case 11: mes= "November";break;
			case 12: mes= "December";break;
		}
		return mes;
	}
}