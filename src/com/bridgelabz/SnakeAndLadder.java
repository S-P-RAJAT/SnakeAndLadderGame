package com.bridgelabz;

public class SnakeAndLadder {
	int position;
	String name;
	public static final int NOPLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public SnakeAndLadder(String name) {
		this.position = 0;
		this.name = name;
	}

	public static int rollDice() {
		return ((int) (Math.floor(Math.random() * 10) % 6) + 1);
	}

	public void play() {
		int result = rollDice();
		System.out.println(this.name+": Rolling Dice Value = "+result);
		
		int option = ((int)(Math.floor(Math.random()*10)%3));
		switch (option) {
		case NOPLAY:
			result = 0;
			System.out.println("OPTION: NOPLAY");
			break;
		case LADDER:
			System.out.println("OPTION: LADDER");

			break;
		case SNAKE:
			System.out.println("OPTION: SNAKE");
			result = -result;
			break;

		default: System.out.println("Invalid Option!");
			break;
		}
		position += result;
		if(position<0) {
			position = 0;
		}
		System.out.println(name + " POSITION: "+position+"\n");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game!");
		System.out.println("");
		SnakeAndLadder player1 = new SnakeAndLadder("Player 1");
		while (player1.position < 100) {
			player1.play();
		}
	}
}