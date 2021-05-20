package com.bridgelabz.snakeladder;

public class Game {

public static void main(String[] args) {
	
	 final int Ladder = 0;
	 int playerstartAt = 0;
	  int count=0;
	int Dice = (int) Math.floor((Math.random() * 6) + 1);
	System.out.println(Dice);
	
	int playerPosition = 0;
     int NoPlay = 0;
	 int Snake = 0;
	while(playerPosition !=100) {
		switch (Dice) {
		case NoPlay:
			playerPosition = playerstartAt;
			count++;
			break;
		case Ladder:
			playerPosition += Dice;
			count++;
			break;
		default Snake:
			playerPosition -= Dice;
			count++;
		}
	}
	
}

}
 