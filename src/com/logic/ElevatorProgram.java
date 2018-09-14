package com.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class elevators
{
	int currentfloor;
	int headingfloor;
	boolean movement;
	boolean doors;

	void goToFloor(int s)
	{
		headingfloor=s;
		System.out.println("\nLift is heading to floor="+headingfloor);
	}

	void openDoors()
	{
		doors=true;
		System.out.println("\nDoors are open\n");
	}

	void closeDoors()
	{
		doors=false;
		System.out.println("\nDoors are close\n");
	}

	void goingUp()
	{
		movement=true;
	}

	void goingDown()
	{
		movement=false;
	}

	void print(int h)
	{
		currentfloor=h;
		System.out.print("\n@@Heading please wait@@\n");
		if(headingfloor>currentfloor)
		{
			System.out.print("\nMovement up\n");
		}
		else
		{
			System.out.print("\nMovement down\n");
		}
	}
}


class ElevatorProgram
{
	public static void main(String args[]) throws IOException
	{
		elevators elev=new elevators();
		elevators elet=new elevators();
		elev.openDoors();
		
		System.out.print("\nPresent floor=");
		BufferedReader stdin1 = new BufferedReader ( new InputStreamReader( System.in ) );
		String h;
		h=stdin1.readLine();
		int pfloor= Integer.parseInt(h);
		
		System.out.print("\nDesired floor=");
		BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
		String l;
		l=stdin.readLine();
		int dfloor= Integer.parseInt(l);
		
		elev.goToFloor(dfloor);

		elet.goingUp();
		elet.goingDown();
		
		elev.print(pfloor);
		elet.closeDoors();
	}
}