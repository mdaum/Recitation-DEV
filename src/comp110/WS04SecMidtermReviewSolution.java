package comp110;

import java.util.ArrayList;

public class WS04SecMidtermReviewSolution {
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
	ArrayList<Rectangle> rects = WS04ShapeMaker.randomSquares(); //this the is the List we want you to use!
	int p01AreaSum() {
		int sum=0;
		/*for (int i =0;i<rects.size();i++){ //for
			sum+=rects.get(i).getHeight()*rects.get(i).getWidth();
		}*/
		for (Rectangle r : rects) {//for each
			sum+=r.getHeight()*r.getWidth();
		}
		return sum;
	}
	
	/**
	 * Problem 2
	 * 
	 * Implement the factorial method for the given parameter n. Remember that 4! = 4*3*2*1. 
	 * Use a for loop.
	 * 
	 */
	
	int p02Factorial(int n) {
		int sum=1;
		for(int i=2;i<=n;i++){
			sum*=i;
		}
		return sum;
	}
	
	/**
	 * Problem 3
	 * 
	 * Given an ArrayList of Strings, finish the method that creates a new ArrayList of Strings
	 * that is reversed from the original. Use a for loop. Note that the IndexHelper method will return
	 * the integer representing the index you want to swap with. So if you pass in (1,ArrayList<String> array)
	 * you will be given the number of the index you want to put that value into!
	 * 
	 */
	private int IndexHelper(int i, ArrayList<String> array) {
		return array.size() - 1 - i;
}
	
	ArrayList<String> p03Reverse() {
		ArrayList<String> toReversep03 = WS04StringMaker.randomNames();
		ArrayList<String>toReturn = new ArrayList<String>();
		for (int i=toReversep03.size();i>=0;i--){
			toReturn.set(IndexHelper(i,toReversep03),toReversep03.get(i) );
		}
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
	 * reverse the elements in the given ArrayList. Use a for loop. Note the helper method. Recall that the 
	 * IndexHelper method returns the index of the element that we want to swap it with given
	 * that we are reversing the element. So if we give the method i = 2 and an array of size 6, it
	 * will return 3. Make sure this makes sense- it helps to draw it out!
	 * 
	 */
	
	private void p04swap(int i, int j, ArrayList<String> list){
		String temp=list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	
	
	ArrayList<String> p04Reverse() {
		ArrayList<String> toReversep04=WS04StringMaker.randomNames(); //reverse this list!
		for(int i=0;i<toReversep04.size()/2;i++){
			p04swap(i,IndexHelper(i, toReversep04),toReversep04);
		}
		return toReversep04;
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
	 * It is quite sad that our basketball team is comprised of mostly seniors. Given the instance variable year which represents the year of the player in question, return the String "We will miss you!" if they are a senior, "You rock!" if they are a junior
	 * or sophomore, "You got this!" if they are a freshman, and otherwise return "Who you?". 
	 * 
	 * 
	 * we use the String method equals() to compare Strings.
	 * 
	 * Remember the conditional OR operator: ||
	 *  
	 */
	String year = WS04YearMaker.getPlayerYear(); //here is the year of the player in question
	String p06BBallYear() {
		if(year.equals("Sophomore")||year.equals("Junior")){
			return "You rock!";
		}
		else if(year.equals("Senior")){ //though else isn't really needed here ;p
			return "We will miss you!";
		}
		else if(year.equals("Freshman")){
			return "You got this!";
		}
		else return "Who you?";
		
	}
	
}
