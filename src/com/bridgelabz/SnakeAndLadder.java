package com.bridgelabz;

public class SnakeAndLadder {
	int position;
	String name;
	
	public SnakeAndLadder(String name) {
		this.position = 0;
		this.name = name;
	}
	public static int rollDice() {
		return ((int)(Math.floor(Math.random()*10)%6)+1);
	}
	public void play() {
		int result = rollDice();
		System.out.println(this.name+": Rolling Dice Value = "+result);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game!");
		System.out.println("");
		SnakeAndLadder player1 = new SnakeAndLadder("Player 1");
		player1.play();
		
	}
}