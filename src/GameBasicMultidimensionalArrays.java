import java.util.Arrays;
import java.util.Scanner;

public class GameBasicMultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Game, making map...");
		System.out.println("dimension for the map");
		
	int dimension = input.nextInt();
	int map[][] = createMap(dimension);
	int mapString[][] = map;
	System.out.println(mapToStringTwo(mapString));
	gameplay(map);
	
	}
	
	public static int [][] createMap(int d){
		int[][] map = new int [d][d];
		for (int f = 0; f< map.length; f++) {
			for(int c =0; c<map[f].length;c++) {
				if(f==0 || c==0 || f==d-1 || c==d-1)
					map[f][c] = 1;
				else
					map[f][c]=0;
			}
			
		}
			//Player localitation (5)
		int player = 5;
		int playerX = map.length/2;
		int playerY = map.length/2;
			map[playerX][playerY]=player;
		int goal = 9;
			//Objetive localitation (9)
			//Testear el 9 para que no salga en la pared
			map[(int)((Math.random()*(map.length-2)+2))][(int)((Math.random()*(map.length-2)+2))]=goal;
		
		
		return map;
	}
	
	public static void gameplay(int[][]map) {
		int goal = 9;
		int player = 5;
		int playerX = map.length/2;
		int playerY = map.length/2;
		
		map[playerX][playerY]= player;
			
		map[(int)((Math.random()*(map.length-2)+2))][(int)((Math.random()*(map.length-2)+2))]=goal;
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Your next : (up/down/left/right");
		String playerMove = input.next().toLowerCase();
		
		//Mientras que la posicion del goal (originalmente 9) no sea 5
		while(map[(int)((Math.random()*(map.length-2)+2))][(int)((Math.random()*(map.length-2)+2))] != 5)
		
		if(playerMove.equals("up")) {
			map[playerX][playerY]=0;
			playerX -=1;
			map[playerX][playerY]=5;
		}
		else if(playerMove.equals("down")) {
			map[playerX][playerY]=0;
			playerX +=1;
			map[playerX][playerY]=5;
			
		}
		else if(playerMove.equals("left")){
			map[playerX][playerY]=0;
			playerY -=1;
			map[playerX][playerY]=5;
			
		}
		else if(playerMove.equals("right")) {
			map[playerX][playerY]=0;
			playerY +=1;
			map[playerX][playerY]=5;
			
			
		}
		else System.out.println("Please input a correct movement");
		
		
	}

	
	public static String mapToString (int[][]map) {
		String mapString ="";
		for(int f = 0; f < map.length;f++) {
			mapString += "\n";
			for(int c=0; c<map[f].length;c++)
				mapString += ""+map[f][c];
		}
		return mapString;
	}
	/*
	public static int[][] startGame(int[][]map) {
		int [][] mapStartGame = map;
		int randomF =(int)(Math.random()*9);
		int randomC =(int)(Math.random()*9);
		
		map[randomF][randomC] = 5;
		
		int objetiveF =(int)(Math.random()*9);
		int objetiveC =(int)(Math.random()*9);
		
		map[objetiveF][objetiveC]=9;
		
		return mapStartGame;
	}
	*/
	public static String mapToStringTwo (int[][]mapStartGame) {
		String mapString ="";
		for(int f = 0; f < mapStartGame.length;f++) {
			mapString += "\n";
			for(int c=0; c<mapStartGame[f].length;c++)
				mapString += ""+mapStartGame[f][c];
		}
		return mapString;
	}
	
}
