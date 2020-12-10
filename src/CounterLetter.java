import java.util.Scanner;

public class CounterLetter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[]letter = new int[26]; //RadomValues();
		
		System.out.println("Key a sentence: ");
		String text = input.nextLine().toUpperCase();
		
		for (int i =0;i<text.length();i++) {
			char c= text.charAt(i);
			if(c>'A' && c<='Z')
				letter [c-'A']++;
		}
		System.out.println(printArray(letter));
	}
	
	
	public static String printArray(int[]elem) {
		
		String report = "";
		for(int i = 0; i<elem.length;i++) {
			char c=(char)(i+'A');
			report += "Letter" +c+" : "+elem[i] +"times\t";
			if(i%5 == 0) report += "\n";
			
		}
		return report;
	}
}
