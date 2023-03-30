package DetyreShtepie1;

import java.util.*;

public class RollAndBuild {
	private static String house1;
	private static String house2;
	private static String base = "\n|     | \n|     | \n ------";
	private static String roof = "\n  /\\ \n /  \\ \n------ \n|    | \n|    | \n------";
	private static String door = "\n  /\\ \n /  \\ \n------ \n|    | \n| || | \n------";
	private static String window1 = "\n  /\\ \n /  \\ \n------ \n|    | \n| ||x| \n------";
	private static String window2 = "\n  /\\ \n /  \\ \n------ \n|    | \n|x||x| \n------";
	
	
	
	public static void main(String[] args) {
		 
		// pretend i fixed a bug...
		/** */
		// i am making changes.... dot dot
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
		
		
		/** while house1 is incomplete and house2 is also incomplete, the game will loop */
		while(house1.equals(window2) == false && house2.equals(window2) == false) {
		    
			/** to switch between players we use: */
			  if (playerSwitching%2 == 0) {
			      playerSwitching++;
			      System.out.println("Player 1 is playing..."); 
			      /** player 1 will play */
			      
	        String input = scan.next();
	    	boolean inputstate = input.equals(""); 
	    	/** when something is typed on the string "input", 
	    	 * this boolean "imputstate" is false. */
		
	    	      if (inputstate == false && house1.equals(window2) == false) {
		            	die = Player1.roll(); System.out.println("You got a " + die);
			
		        	
	         		/** if the player rolls a 6 */ 
	            		if(die == 6 && house1 == "") {
	            			house1 = Player1.getBase(house1); 
	            		} else if(die == 6) {
			            	System.out.println("You already have a base!"); 
	            			System.out.println(house1);
	         			}
			
			
	        		 /** if the player rolls a 5 */
		            	if(die == 5 && house1 == base) {
	            			house1 = Player1.getRoof(house1);
		            	} else if(die == 5 && house1 == "") {
		            		System.out.println("You need base first!"); 
		            		System.out.println(house1);
	         			}
	            		else if(die == 5) {
	            			System.out.println("You already have a roof!");
		            		System.out.println(house1);
		         		}
			
			
		           	/** if the player rolls a 4 */
			            if(die == 4 && house1 == roof) {
			             	house1 = Player1.getDoor(house1);
		            	} else if(die == 4 && house1 == "") {
			            	System.out.println("You need base first!");
			             	System.out.println(house1);
		           		}
		            	else if(die == 4 && house1 == base) {
		            		System.out.println("You need a roof first!");
			            	System.out.println(house1);
		         		}
 		            	else if(die == 4) {
 			            	System.out.println("You already have a door!");
 			            	System.out.println(house1);
 			         	}
			
			
		         	/** if the player rolls a 3 */
			            if(die == 3 && house1 == door) {
		             		house1 = Player1.getWindow1(house1);
		            	} else if(die == 3 && house1 == window1) {
			            	house1 = Player1.getWindow2(house1);
				        } else if(die == 3 && house1 == "") {
				            System.out.println("You need base first!");
			            	System.out.println(house1);
				        }
			            else if(die == 3 && house1 == base) {
				            System.out.println("You need a roof first!");
			            	System.out.println(house1);
			         	}
			            else if(die ==3 && house1 == roof) {
				            System.out.println("you need a door first!");
				            System.out.println(house1);
				        }
 		            	else if(die == 3) {
 				            System.out.println("You already have a door!");
 			         	}
			
			
		        	/** if the player rolls a 2 or 1 */
	        		    if(die < 3) {
			            	System.out.println("You can't do anything with that value :(");
				            System.out.println(house1);
				        }
	         	}
			
			    
			  } else {
			      playerSwitching++;
			      System.out.println("Player 2 is playing...");
			      /** player 2 will play... we repeat the same steps as player 1 */
			      
			      String input = scan.next();
					boolean inputstate = input.equals(""); 
					
					if (inputstate == false && house2.equals(window2) == false) {
						die = Player2.roll(); System.out.println("You got a " + die);
						
						
						if(die == 6 && house2 == "") {
							house2 = Player2.getBase(house2);
						} else if(die == 6) {
							System.out.println("You already have a base!"); 
							System.out.println(house2);
							}
						
						
						if(die == 5 && house2 == base) {
							house2 = Player2.getRoof(house2);
						} else if(die == 5 && house2 == "") {
							System.out.println("You need base first!"); 
					     	System.out.println(house2);
					     	}
						else if(die == 5) {
							System.out.println("You already have a roof!");
							System.out.println(house2);
							}
						
						
						if(die == 4 && house2 == roof) {
							house2 =Player2.getDoor(house2);
						} else if(die == 4 && house2 == "") {
							System.out.println("You need base first!");
							System.out.println(house2);	
							}
						else if(die == 4 && house2 == base) {
							System.out.println("You need a roof first!");
							System.out.println(house2);
							}
			 			else if(die == 4) {
			 				System.out.println("You already have a door!");
			 				System.out.println(house2);
			 				}
						
						
						if(die == 3 && house2 == door) {
							house2 =Player2.getWindow1(house2);
						} else if(die == 3 && house2 == window1) {
							house2 =Player2.getWindow2(house2);
						} else if(die == 3 && house2 == "") {
							System.out.println("You need base first!");
							System.out.println(house2);
							}
						else if(die == 3 && house2 == base) {
							System.out.println("You need a roof first!");
							System.out.println(house2);
							}
						else if(die ==3 && house2 == roof) {
							System.out.println("you need a door first!");
							System.out.println(house2);
							}
			 			else if(die == 3) {
			 				System.out.println("You already have a door!");
			 				}
						
						
						if(die < 3) {
							System.out.println("You can't do anything with that value :(");
							System.out.println(house2);
							}
					}
			 
			  }
			  if(house1 == window2 || house2 == window2) 
				{ System.out.println("You have built a house, you win! Thank you for playing!");
				scan.close();
				}
			}

	}
						
			
		
		

	
	
	/** the method that allows us to roll the die */
	public int roll() {
		int die = (int)(Math.random()*6)+1;
		return die;
	}
	
	/** the method that will build the base of the house
	 * @param house ... */
	public String getBase(String house) {
		house = base;
		System.out.println("You've built the base!");
		System.out.println(house);
		return house;
	}
	
	public String getRoof(String house) {
		house = roof;
		System.out.println("You've built the roof!");
		System.out.println(house);																																					
		return house;
	}
	
	public String getDoor(String house) {
		house = door;
		System.out.println("You've added the door!");
		System.out.println(house);
		return house;
	}
	
	public String getWindow1(String house) {
		house = window1;
		System.out.println("One window down, one more to go!");
		System.out.println(house);
		return house;
	}
	
	public String getWindow2(String house) {
		house = window2;
		System.out.println(house);
		return house;
	} 
	
}
