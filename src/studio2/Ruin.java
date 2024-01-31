package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			//variables
			System.out.println("Enter starting amount: ");
			int startAmount = in.nextInt(); 
	
			System.out.println("Enter your chance of winning: ");
			double winChance = in.nextDouble(); 
			
			System.out.println("Enter your desireable amount: ");
			int winLimit = in.nextInt(); 
			
			int probability = (int)(Math.random()*2+0);
			int round = 0; 
			
			System.out.println("Enter amount of days: ");
			int totalSimulations = in.nextInt();
			int count = 0;
			
			int done = 0;
			
			//count++; done++;
			while (startAmount > 0 && winLimit>startAmount); {
				
				if (Math.random()>winChance) {

					startAmount = startAmount + 1;	
			
				}
				
				else 
					{
					startAmount = startAmount - 1; 
			
					}
			
				
			}
			if (winLimit==startAmount)
			{ 
				System.out.println("Game 1: You win $1, Total amount " + round);
			
			System.out.println("Stimulation " + count + ": "); }
			
			else 
		
			{System.out.println("Game 1: You lose $1, Total amount " + round);
			System.out.println("Stimulation " + count + ": ");}
			
			
			}}
				
			