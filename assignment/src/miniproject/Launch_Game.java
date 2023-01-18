package miniproject;

import java.util.Scanner;


	
class Guesser{	
int guessNum;
	
 int guessNum(){
		
	 boolean low = true;
	while(low) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser Kindly guess the number");
		guessNum=scan.nextInt();
		
		for(int i=0; i<=10; i++) {
			if(guessNum==i) {
				low=false;
			}
			
		}
		
	 }
		return guessNum;
	}
}

class Player{
	
	int guessNum;
	int guessNum(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Player Kindly Guess the Number");
	
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	void collectNumFromGuesser(){
		Guesser g= new Guesser();
		numFromGuesser=g.guessNum();
		boolean flag=false;
	}
	
	void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2= new Player();
		Player p3 = new Player();
		
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
		
		
	
	}
	
	
	void compare() {
		if(numFromGuesser==numFromPlayer1) {
			

			
			
			
			if(numFromGuesser== numFromPlayer2 && numFromGuesser== numFromPlayer3) {
				System.out.println("All Player  Guesss and Game tied");
				
				boolean flag=true;
			}
				else if(numFromPlayer2== numFromGuesser) {
						 
					
					System.out.println("Player 1 and Player 2 won the game");
				
				}
				else if(numFromGuesser==numFromPlayer3) {
					System.out.println("Player 1 and Player 3 won the game");
				}
				else {
					System.out.println("Player 1 Won the Game");
				}
		}
		else if(numFromGuesser==numFromPlayer2) {
			
			
			if(numFromGuesser== numFromPlayer3) {
				System.out.println("Player 2 and player 3 won the game");
			}
			else {
				System.out.println("Player 2 Won the Game");
			}
			
		}
		
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("Player 3 Won the Game");
			
		}
		else {
			System.out.println("Game lost TRY gain");
		}
	}
}
public class Launch_Game {
	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		
	
	}
}