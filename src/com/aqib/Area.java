package com.aqib;

public class Area {

	public static void main(String[] args) {
		int l=1,b=2,r=5;
		float pi = (float) 3.14;
		
		Area ob = new Area();
		
		System.out.println(" enter dimension of side to find the area of square");
		ob.area(l);
		
		System.out.println(" enter dimension of radius to find the area of circle");
		ob.area(r,pi);
		
		System.out.println(" enter dimension of length and breadth to find the area of rectangle");
		ob.area(l,b);		
	}

	public void area(int l, int b){
		System.out.println(" area of rectangle "+ l*b);
	}
	
	public void area(int r, float pi){
		System.out.println(" area of circle "+ pi*r*r);
	}
	
	public void area(int l){
		System.out.println(" area of square "+ l*l);
	}
	
	public void area(){
		System.out.println(" area of default ");
	}
}
