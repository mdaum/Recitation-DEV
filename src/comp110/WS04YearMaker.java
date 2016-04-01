package comp110;

import java.util.Random;

public class WS04YearMaker {
	private final static String senior = "Senior";
	private final static String junior = "Junior";
	private final static String soph = "Sophomore";
	private final static String fresh = "Freshman";
	private final static String na = "N/A";
	public static String getPlayerYear(){
		Random r = new Random();
		double d = r.nextDouble();
		if(d<.2)return senior;
		if(d<.4)return junior;
		if(d<.6)return soph;
		if(d<.8)return fresh;
		return na;
	}
}
