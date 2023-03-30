import java.util.*;

public class myProject {
	private static String house1;
	private static String house2;
	private static String base = "\n|     | \n|     | \n ------";
	private static String roof = "\n  /\\ \n /  \\ \n------ \n|    | \n|    | \n------";
	private static String door = "\n  /\\ \n /  \\ \n------ \n|    | \n| || | \n------";
	private static String window1 = "\n  /\\ \n /  \\ \n------ \n|    | \n| ||x| \n------";
	private static String window2 = "\n  /\\ \n /  \\ \n------ \n|    | \n|x||x| \n------";


	public static void main(String[] args) {
		 
		/** */
		RollAndBuild Player1 = new RollAndBuild();
		RollAndBuild Player2 = new RollAndBuild();
		/** the scanner will alow us to throw the dice on command */
		Scanner scan = new Scanner(System.in);
		
		house1 = "";
		house2 = "";
		/** the die we will use the method "roll" on */
		int die;
		/** the value which will let us switch between players */
		int playerSwitching = 0;
		
		
		System.out.println("Hello! Welcome to our game!");
		System.out.println("You have to roll the dice to build a house!");
		System.out.println("Type something to start! \n");
		


}
