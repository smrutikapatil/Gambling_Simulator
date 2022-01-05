package bridgelabz.gambler;

import java.util.Random;

public class UC3_Calculative_Gambler_Won_Or_Lost {
            public static void main (String[] args){
	        int stake_of_Gambler= 100;
	        int bet_for_Game = 1;
	        while(stake_of_Gambler <=149 && stake_of_Gambler>=51)
	        {
	        	 int i = (int) (Math.floor(Math.random()* 10) % 2) ;
	     	     int count =1;
	     	    if (i == 0){
	            System.out.println("Player won the game");
	            stake_of_Gambler=stake_of_Gambler+bet_for_Game;
	            count++;
	        }
	            else{
		            System.out.println("Player loss the Game");
		            stake_of_Gambler=stake_of_Gambler-bet_for_Game;
		            count++;
		        }
            System.out.println("The amount at Gamer after end of Game : "+stake_of_Gambler);
			System.out.println("The No of Games Played by Gamer : " +count);
	  	}
      }
}


