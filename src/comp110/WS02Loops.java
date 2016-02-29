package comp110;

import java.util.ArrayList;

class WS02Loops {

  /*
   * GUIDED SECTION
   * 
   * We will work through these problems together in recitation.
   */

  /**
   * Problem 1
   * 
   * Let's implement the code from the CPU Hat Practice Puzzle from the midterm.
   * 
   * 
   */
  int p01Puzzle(int n) {
    int input = n;
    int output = 1;
    // code goes here
    return output;
  }

  /**
   * Problem 2
   * 
   * Let's implement a method called p02Sum that takes in an int and returns the
   * sum of 1 up to that int. For example, if we called this method with
   * argument 4, we would expect an output of 10 because 1+2+3+4 = 10. Use a
   * while loop to implement this functionality.
   * 
   */

  /**
   * Problem 3
   * 
   * The WS02RandomShapes class can generate shapes for us at random. Our method
   * should return a Shapes container of all circles with a radius larger than
   * 10 added.
   * 
   * Use Circle's double getRadius() method to determine its radius.
   */
  Shapes p03RadiusTester() {
    WS02ShapeMaker shapeMaker = new WS02ShapeMaker();
    ArrayList<Circle> circles = shapeMaker.randomCircles();
    Shapes container = new Shapes();

    int i = 0;
    while (i < circles.size()) {
      // TODO:
      i++;
    }

    return container;
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
   * Implement a method called p04Average that takes in an int and returns the
   * average of numbers 1 to that int.
   * 
   * Note that the formula for average is the sum of all numbers of interest
   * divided by the count of numbers.
   * 
   * Think about how this functionality is similar to that of our p02Sum. Could
   * you reuse p02Sum in order to avoid a duplication of code?
   * 
   */

  /**
   * Problem 5
   * 
   * Implement a method named p05ContainerAdder.
   * 
   * It should use:
   * 
   * WS02ShapeMaker shapeMaker = new WS02ShapeMaker();
   * 
   * ArrayList<Rectangle> squares = shapeMaker.squares();
   * 
   * Similar to problem 3. The method should instantiate a Shapes object and use
   * a while loop to add each Square object in the ArrayList to the Shapes
   * object.
   * 
   * You don't want all the Squares to be on top of each other. You can use void
   * setX(double x), void setY(double y) to arrange the squares.
   * 
   * Think about how we can translate each square by a varying amount.
   * 
   * The method should return the Shapes object once all Squares have been
   * added.
   */

}