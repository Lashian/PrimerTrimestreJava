
public class AnalizeAverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numbers = generateArray(100);
		double average = average(numbers);
		int numberBiggerAv = numberBiggerAv(numbers,average);
		
		
		
	}
	
	public static String printArray(int n[]) {
		String report= "";
		for (int i = 0; i<n.length;i++) {
			
			report += n[i]+"";
			if(i%10==0) report += "\n";
		}
			
		return report;
	}
	
	
	public static int numberBiggerAv(int[] numbers, double av) {
		
		int n=0;
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i] > av) n++;
		}
		return 0;
	}


	public static int[] generateArray(int n) {
		int[] numbers = new int[n];
		for (int i = 0; i <n; i++) {
			numbers[i] = (int)(Math.random()*11);
			
		
		}	return numbers;
		
	}
	
	public static double average (int[] numbers) {
		
		double av = 0;
		for(int i = 0; i < numbers.length;i++) {
			av +=numbers[i];
			
		
		}
				return av/numbers.length;
		
	}

}
