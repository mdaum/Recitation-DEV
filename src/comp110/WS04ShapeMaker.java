package comp110;

import java.util.ArrayList;

public class WS04ShapeMaker {

 public static ArrayList<Rectangle> randomSquares() {
	    ArrayList<Rectangle> squares = new ArrayList<Rectangle>();

	    int i = 0;
	    while (i < 10) {
	      Rectangle r = new Rectangle();
	      r.setHeight(15.0);
	      r.setWidth(15.0);
	      r.setX(Math.random() * 10.0 + 5.0);
	      r.setY(Math.random() * 10.0 + 5.0);
	      squares.add(r);
	      i++;
	    }

	    return squares;
	  }
	
}
