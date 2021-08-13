package com.bridgelabz.linecomputation;

public class linecomp {
	public static void main(String[] args){
		
		System.out.print("Calculated using ");
		int ran = (int)(( Math.random()*10 ) % 2 );
		if ( ran == 1) {
			System.out.print("CompareTo :");
			System.out.println();
			CalculateLine.computecompare();
		}
		else {
			System.out.print("Equals :");
			System.out.println();
			CalculateLine.computeequal();
		}
	}
}
