package com.bridgelabz.linecomputation;

public class linecomp {
	public static void main(String[] args){
		
		int x1= 1;  //x co-ordinate of left end point of line.
		int y1 = 1; //y co-ordinate of left end point of line.
		int x2 = 5; //x co-ordinate of right end point of line
		int y2 = 6; //y co-ordinate of right end point of line
		
		double length = (Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
		// length variable gives length of line.
		
		System.out.println("The length of line having points (" + x1 + "," + y1 +") and ("+x2 +","+y2+") is " + String.format("%.2f",) +".");
	}
}
