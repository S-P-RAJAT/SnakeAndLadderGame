package com.bridgelabz;

public class SnakeAndLadder {
	int position;
	int count;
	String name;
	public static final int NOPLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public SnakeAndLadder(String name) {
		this.position = 0;
		this.count = 0;
		this.name = name;
	}

	public int rollDice() {
		count += 1;
		return ((int) (Math.floor(Math.random() * 10) % 6) + 1);
	}

	public int getCount() {
		return count;
	}

	public void play() {
		int result = rollDice();
		System.out.print(this.name + ":\nRolling Dice Value = " + result);

		int option = ((int) (Math.floor(Math.random() * 10) % 3));
		switch (option) {
		case NOPLAY:
			result = 0;
			System.out.print("\t OPTION: NOPLAY");
			break;
		case LADDER:
			System.out.print("\t OPTION: LADDER");

			break;
		case SNAKE:
			System.out.print("\t OPTION: SNAKE");
			result = -result;
			break;

		default:
			System.out.println("Invalid Option!");
			break;
		}
		position += result;
		if (position < 0) {
			position = 0;
		} else if (position > 100) {
			position -= result;
		}
		System.out.println("\nPOSITION: " + position + "\n");
		if (option == LADDER && position!=100) {
			this.play();
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Game!");
		System.out.println("");
		SnakeAndLadder player1 = new SnakeAndLadder("Player 1");
		SnakeAndLadder player2 = new SnakeAndLadder("Player 2");

		while (true) {
			player1.play();
			if(player1.position == 100) {
				System.out.print("The number of times the dice was played to win the game by ");
				System.out.println(player1.name + ": "+player1.getCount());
				break;
			}
			player2.play();
			if(player2.position == 100) {
				System.out.print("The number of times the dice was played to win the game by ");
				System.out.println(player2.name + ": "+player2.getCount());
				break;
			} 
		}
	}
}