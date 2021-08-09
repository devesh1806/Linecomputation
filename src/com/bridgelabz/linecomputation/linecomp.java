package com.bridgelabz.linecomputation;

public class linecomp {
	public static void main(String[] args){
		
		//For Line 1
		int x1= 1;  //x co-ordinate of left end point of line.
		int y1 = 1; //y co-ordinate of left end point of line.
		int x2 = 5; //x co-ordinate of right end point of line
		int y2 = 6; //y co-ordinate of right end point of line
		
		double length = (Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
		// length variable gives length of line.
		
		System.out.println("The length of line having points (" + x1 + "," + y1 +") and (" + x2 +"," + y2 +") is " + String.format("%.2f",length) +".");
		
		
		//For Line 2
		int x3=  5;  //x co-ordinate of left end point of line.
		int y3 = 6; //y co-ordinate of left end point of line.
		int x4 = 1; //x co-ordinate of right end point of line
		int y4 = 1; //y co-ordinate of right end point of line
		
		double length1 = (Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2)));
		// length1 variable gives length of line.

		System.out.println("The length of line having points (" + x3 + "," + y3 +") and (" + x4 +"," + y4 +") is " + String.format("%.2f",length1) +".");

		
		//Checking if length of two lines are equal using equals method.
		if ((String.valueOf(length)).equals((String.valueOf(length)))) System.out.println("Length of both lines are equal.");
		else System.out.println("Length of both lines are not equal.");
		
	}
}
