package comp110;

import java.util.ArrayList;

public class WS03Debugging {

  /*
   * GUIDED SECTION
   * 
   * We will work through these problems together in recitation.
   */

  /**
   * Problem 1
   * 
   * Method p01Factorial computes a factorial (or at least it is suppose to).
   * Note that "four factorial", written as 4!, is 1*2*3*4 = 24. Use print
   * statements to find the error in the code. Then fix it!
   * 
   * 
   */
  int p01Factorial(int input) {
    int n = input;
    int output = 1;
    while (n > 0) {
      output = 1 * n;
      n--;
    }
    return output;
  }

  /**
   * Problem 2
   * 
   * Our method p02MinPoints is suppose to return the full name of the Carolina
   * player that has made the least points this season. Does it seem like it
   * does this? How can we find and fix the error?
   * 
   */

  String p02MinPoints() {
    Team unc = WS03DebuggingTeams.getTarHeels();
    ArrayList<Player> uncRoster = unc.getRoster();
    Player minPlayer = uncRoster.get(0);
    int minPoints = 0;
    int i = 0;
    while (i < uncRoster.size()) {
      if (uncRoster.get(i).getTotalPoints() < minPoints) {
        minPoints = uncRoster.get(i).getTotalPoints();
        minPlayer = uncRoster.get(i);
      }
      i++;
    }
    return minPlayer.getFullName();
  }

  /**
   * Problem 3
   * 
   * Method p03Comparison takes in two int parameters, input1 and input2. If
   * input1 is greater than input2 we return the number 1, if input2 is greater
   * than input2 we return 2, and if the numbers are equal we return -100.
   * 
   * 
   */

  int p03Comparison(int input1, int input2) {
    if (input1 > input2) {
      if (input1 == input2) {
        int ourReturn = -100;
      } else {
        int ourReturn = 1;
      }
    }
    if (input2 > input1) {
      int ourReturn = 2;
    }
    return ourReturn;
  }

  /*
   * TEAMWORK SECTION
   * 
   * Work on the following problems with your partner or small group. Note that
   * everyone must submit their own worksheet.
   */

  /**
   * Problem 4
   * 
   * Method p04Count returns the number of times a while loop runs. The method
   * takes in two int parameters: the first one is the number we want to
   * increment our index variable by (we typically use 1) and the second is what
   * we want to compare our index variable to in our test condition. This method
   * is running correct- there are no bugs to fix. Get the method to PRINT the
   * value of our index variable each time the while loop runs.
   * 
   * For each set of parameters you provide the method, what do you expect the
   * method to return? What would happen if increment was negative? (Try it if
   * you dare!)
   * 
   */

  int p04Count(int increment, int n) {
    int count = 0;
    int i = 0;
    while (i < n) {
      count++;
      i = i + increment;
    }
    return count;
  }

  /**
   * Problem 5
   * 
   * Method p05FirstLetterB counts the number of players on Carolina's roster
   * that have a first name that starts with the letter 'B'. Go ahead and run
   * this method and see what happens. What does all this ugly red text mean?
   * What does this particular error message indicate? Find and fix the bug!
   * 
   */

  int p05FirstLetterB() {
    Team unc = WS03DebuggingTeams.getTarHeels();
    ArrayList<Player> uncRoster = unc.getRoster();
    int i = 0;
    int count = 0;
    while (i <= uncRoster.size()) {
      if (uncRoster.get(i).getFirst().charAt(0) == 'B') {
        count++;
      }
      i++;
    }
    return count;
  }

  /**
   * Problem 6
   * 
   * Method p06ArrayNames return an ArrayList<String> object that holds all the
   * full names of the players on Carolina's roster who have scored more than 50
   * points this season. Run the method and see what happens. What could be
   * causing this bug?
   * 
   */

  ArrayList<String> p06ArrayNames() {
    Team unc = WS03DebuggingTeams.getTarHeels();
    ArrayList<Player> uncRoster = unc.getRoster();
    int i = 0;
    ArrayList<String> output = new ArrayList<String>();
    while (i < uncRoster.size()) {
      if (uncRoster.get(i).getTotalPoints() > 50) {
        output.add(uncRoster.get(i).getFullName());
        i++;
      }
    }
    return output;
  }

  /**
   * Problem 7
   * 
   * Our method p07ScoredMoreThan takes an int parameter called p and returns a
   * boolean. The method should return true if there is a player on the Carolina
   * roster that has scored more than p points. Use print statements to figure
   * out if we enter the while loop. Then use print statements to figure out if
   * we ever enter the if statement. Find the error and fix the method.
   * 
   */

  boolean p07ScoredMoreThan(int p) {
    Team unc = WS03DebuggingTeams.getTarHeels();
    ArrayList<Player> uncRoster = unc.getRoster();
    boolean output = false;
    int i = 0;
    while (i > uncRoster.size()) {
      p = uncRoster.get(i).getTotalPoints();
      if (uncRoster.get(i).getTotalPoints() > p) {
        output = true;
      }
      i++;
    }
    return output;
  }

}
