
public class DisplayCurrentTime {

	public static void main(String[] args) {
		
		System.currentTimeMillis();

		long millis = System.currentTimeMillis();
		
		long seconds = (millis / 1000);
		int CurrentSeconds = (int) (seconds % 60);
		
		long minutes = (seconds / 60);
		int CurrentMinutes = (int) (minutes % 60);
		
		long hours = (minutes / 60);
		int CurrentHours = (int) (hours % 24) + 2;
		
	//	(SIN TERMINAR) A partir de aquí no corresponde a lo que se pide, es extra por mi cuenta
	//	long days = (hours /30);
	//	int days = (int) (days % 30)
		
		System.out.println(CurrentHours + ":" + CurrentMinutes + ":" + CurrentSeconds);
		
	}

}
