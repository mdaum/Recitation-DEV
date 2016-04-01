package comp110;

import java.util.ArrayList;

public class WS04SecMidtermReview {
	/*
	 * GUIDED SECTION
	 * 
	 * We will work through these problems together in recitation.
	 */
	
	/**
	 * Problem 1
	 * 
	 * Let's implement the code to traverse through the given ArrayList of Rectangles and
	 * return the sum of the area of all the Rectangles. Use a for loop. Then redo with a 
	 * for-each loop!
	 * 
	 * 
	 */
	
	int p01AreaSum() {
		//ArrayList<Shapes> ourRects = ?
		return 0;
	}
	
	/**
	 * Problem 2
	 * 
	 * Implement the factorial method for the given parameter n. Remember that 4! = 4*3*2*1. 
	 * Use a for loop.
	 * 
	 */
	
	int p02Factorial(int n) {
		return 0;
	}
	
	/**
	 * Problem 3
	 * 
	 * Given an ArrayList of Players, finish the method that creates a new ArrayList of Players
	 * that is reversed from the original. Use a for loop.
	 * 
	 */
	
	ArrayList<Player> p03Reverse() {
		//ArrayList<Player> ourPlayers = ?
		return null;
	}
	


	/*
	 * TEAMWORK SECTION
	 * 
	 * Work on the following problems with your partner or small group. Note
	 * that everyone must submit their own worksheet.
	 */
	
	/**
	 * Problem 4
	 * 
	 * We are going to reverse an ArrayList using a different strategy. This is a multiple step 
	 * question! 
	 * 
	 * First create a swap method. This method should be private and called p04swap and should 
	 * take two int inputs and an ArrayList. The method should swap the elements at indexes i and j
	 * then return the ArrayList. 
	 * 
	 * Secondly, finish the p04Reverse method. This method should use our p04swap method to 
	 * reverse the elements in the given ArrayList. Use a for loop. Note the helper method. The 
	 * p04IndexHelper method returns the index of the element that we want to swap it with given
	 * that we are reversing the element. So if we give the method i = 2 and an array of size 6, it
	 * will return 3. Make sure this makes sense- it helps to draw it out!
	 * 
	 */
	
	private int p04IndexHelper(int i, ArrayList<Player> array) {
			return array.size() - 1 - i;
	}
	
	ArrayList<Player> p04Reverse() {
		//ArrayList<Player> ourPlayers = ?
		
		return null;
	}
	
	
	/**
	 * Problem 5
	 * 
	 * In method p05EvenFactorial we are computing the factorial using only the evens. So if we
	 * inputed 7 we would expect 6*4*2 = 48. Fix the update condition in the for loop so that this
	 * method functions as expected!
	 * 
	 */
	
	int p05EvenFactorial(int n) {
		if (n % 2 == 1) {
			n--;
		}
		int fact = 1;
		for (int i = n; i > 0; i = i-2 ) {
			fact = fact * i;
		}
		return fact;
	}
	
	/**
	 * Problem 6
	 * 
	 * It is quite sad that our basketball team is comprised of mostly seniors. Given a parameter of a Player p into
	 * our p06BBallYear method, return the String "We will miss you!" if they are a senior, "You rock!" if they are a junior
	 * or sophomore, "You got this!" if they are a freshman, and otherwise return "Who you?". 
	 * 
	 * The method from the Player class getYear() returns a String (first letter capitalized and the rest lower case) and
	 * we use the String method equals() to compare Strings.
	 * 
	 * Remember the conditional OR operator: ||
	 *  
	 */
	
	String p06BBallYear(Player p) {
		
		return "Complete this method!";
	}
	
	
}
