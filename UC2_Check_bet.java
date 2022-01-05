package bridgelabz.gambler;

import java.util.Random;

public class UC2_Check_bet {

	public static void main(String[] args) {
        int bet = 1;
        int i = (int) (Math.floor(Math.random()* 10) % 2) ;
        if (i == 0){
            System.out.println("Player won the game");
        }
        else{
            System.out.println("Player loss the Game");
        }
	}

}
