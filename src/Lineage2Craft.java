import java.util.Scanner;

public class Lineage2Craft {

	public static void main(String[] args) {
		int EnterOption=0;
		// TODO Auto-generated method stub
 do {
		int Craft = (int) (Math.random()*100);
		Scanner input = new Scanner (System.in);
		System.out.println("Menu");
		System.out.println("1.- Craftear Arma Dyansty");
		System.out.println("2.- Craftear Armadura Dynasty");
		System.out.println("3.- Craftear joyeria Dynasty");
		System.out.println("4.- Exit");
		System.out.println("Selecciona el tipo de craft que queires realizar: ");
		EnterOption = input.nextInt();
		
		switch(EnterOption) {
		
		case 1: if(Craft <5) {
			System.out.println("You got Fundation Dynasty weapon");
		} else if(Craft <60) {
			System.out.println("Your craft has been successful");
		}else System.out.println("You failed your craft. " + "A farmear los putos cokes otra vez");
		break;
		
		case 2:if(Craft <5) {
			System.out.println("You got Fundation Dynasty Armor");
		} else if(Craft <60) {
			System.out.println("Your craft has been successful");
		}else System.out.println("You failed your craft. " + "Venga, a farmear otra vez los Mythril Alloy campeon");
		break;
		
		case 3:if(Craft <5) {
			System.out.println("You got Fundation Dynasty Jewel");
		} else if(Craft <70) {
			System.out.println("Your craft has been successful");
		}else System.out.println("You failed your craft. " + "Loguea al spoiler que te veo farmeando los Tons otra vez");
		break;
		}
 }while(EnterOption!=4);
		System.out.println("Gracias por usar a BuenHombre");
	//	System.out.println("");
	//	System.out.println("Quieres seguir crafeando?");
	//	String EnterOptionTwo = input.toString();
		
	//	if (EnterOptionTwo == "yes") {
	//		System.out.println("Po mu bien");
	//	}System.out.println("Pos mu mal");
	 }
	
	
}
