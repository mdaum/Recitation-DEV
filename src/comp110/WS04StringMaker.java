package comp110;

import java.util.ArrayList;
import java.util.Random;

public class WS04StringMaker {

 public static ArrayList<String> randomNames() {
	    ArrayList<String> names = new ArrayList<String>();

	    int i = 0;
	    int j=0;
	    Random r = new Random();
	    int upperbound = 126;
	    int lowerbound=33;
	    while(j<5){
	    	String toGen="";
	    	while (i < 4) {
	    		int random_integer = r.nextInt(upperbound-lowerbound) + lowerbound;
	    		toGen+=  (char) random_integer;
	    		i++;
	    	
	    	}
	    names.add(toGen);
	    j++;
	    }
	    return names;
	  }
	
}
