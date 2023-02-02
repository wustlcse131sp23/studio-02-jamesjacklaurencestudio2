package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("what is the amount of money you start with?");
		int startAmount = 2;
		
		double winChance = 0.7;
		
		int winLimit = 10;

		int totalSimulations = 500;
		
		int numberOfLose = 0;
		
		for (int count = 1; count <= totalSimulations; count++)
		{
			int gamesPlayed = 0;
			while (startAmount > 0 && startAmount < winLimit)
			  {
				double playChance = Math.random();
				if (playChance <= winChance)
				{
					startAmount++;
				}
				else 
				{
					startAmount--;
				}
				gamesPlayed++;
				
			  }
			String WinorLose = "WIN";
			
			if (startAmount == 0)
			{
				WinorLose = "LOSE";
				
				numberOfLose++;
			}
			startAmount = 2;

			System.out.println("Simulation " + count + ": " + gamesPlayed + " " + WinorLose);
		}
	
		System.out.println("number of ruins " + numberOfLose);
		
		double ruinRate = numberOfLose / (totalSimulations + 0.0);
		
		double alpha = (1 - 0.7)/0.7;
		
		double expectedRuinRate = (Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit))/(1-Math.pow(alpha, winLimit));
		
		System.out.println("Ruin Rate from Simulation: " + ruinRate + "Expected Ruin Rate: " + expectedRuinRate);
	
				

	}

}
