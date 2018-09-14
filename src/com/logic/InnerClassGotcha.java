package com.logic;

public class InnerClassGotcha {
	public static void main(String[] args) {
		new Two().displayTwo();
	}	
}
class One{
	int x;
	public void display(){
		System.out.println("one_display");
	}
	public One() {
		super();
	}
	public void one(){
		System.out.println("method_one_");
	}
}
class Two{
		One ob = new One(){
			public void display(){
				System.out.println("Two_display");
			}
			public void disp(){
				System.out.println("Two_disp");
			}
		};
	//cannot try to put inside a method like public void troy(), should be outside any method
	/*public void troy(){
		One ob = new One(){
			public void display(){
				System.out.println("Two_display");
			}
			public void disp(){
				System.out.println("Two_disp");
			}
		};
	}*/
		public void displayTwo(){
			ob.display();
		//	ob.disp();   not legal
		}
}