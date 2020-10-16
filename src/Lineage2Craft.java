
public class Lineage2Craft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Craft = (int) (Math.random()*100);
		
		if(Craft <5) {
			System.out.println("You got Fundation Dynasty Sword");
		} else if(Craft <60) {
			System.out.println("Your craft has been successful");
		}else System.out.println("You failed your craft");
	}

}
