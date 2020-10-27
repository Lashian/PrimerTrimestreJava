
public class PredictFutureTuition {
//Mientras que la cantidad del 7% no sea mayor que 20.000, se repite el blucle
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tuition = 10000;
		double interest = tuition * 0.07;
		double year = 0;
		//Calcular en que año supera 20000
		for (year = 1; tuition <=20000; year++ ) {
			 tuition += (int) (interest);
			
		}
	System.out.println(year);
	}

}
