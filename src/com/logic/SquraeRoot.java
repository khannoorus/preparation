package com.logic;

public class SquraeRoot {

	public static void main(String[] args) {
		System.out.println(new SquraeRoot().sqrt(10000));
	}
	
	public double sqrt(int number) {
	    if (number < 0) return -1;
	    if (number == 0 || number == 1) return number;
	    double start = 0.0;
	    double end = number;
	    double precision = 0.001;
	    double middle = start;
	    double difference = (float) Math.abs(Math.pow(middle, 2) - number);
	    while (difference >= precision) {
	        middle = (start + end) / 2.0;
	        if (Math.pow(middle, 2) > number) {
	            end = middle;
	        } else {
	            start = middle;
	        }
	        difference = Math.abs(Math.pow(middle, 2) - number);
	    }
	    return middle;
	}

		
	
}
