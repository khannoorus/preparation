package com.aqib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnorderedPair {

	int n = 0,k,x,y;
	int a[];

	public static void main(String[] args) throws Exception {		
		UnorderedPair ob = new UnorderedPair();
		ob.createInput();	
		System.out.println(ob.getPair()); // 6
	}	

	private void createInput() throws Exception {

		String str = null;
		String[] line;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter line 1");  // 5 2 1 0
		str = s.nextLine();
		line = str.split(" ") ;
		n = Integer.parseInt(line[0]);
		k = Integer.parseInt(line[1]);
		x = Integer.parseInt(line[2]);
		y = Integer.parseInt(line[3]);
		
		if(n>1000 || k>1000 || x>1000 || y>1000){
			throw new Exception();
		}

		System.out.println("Enter line 2");  // 1 2 3 4 5
		str = s.nextLine();			
		line = str.split(" ") ;

		a =  new int[n];		   
		for(int i=0;i<5;i++){
			a[i] = Integer.parseInt(line[i]);
			if(a[i]>1000){
				throw new Exception();
			}
		}

		s.close();
	}
	
	int getPair(){		
		List<String> combination = new ArrayList<String>();	
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(((a[i]+a[j]) % k == x) && ((a[i]*a[j]) % k == y)){
					addIfSatisfiedCriteria(combination, i, j);
				}
			}
		}		
		return combination.size();  
	}

	private void addIfSatisfiedCriteria(List<String> combination, int i, int j) {
		String tempStr;
		boolean contain;
		contain = false;
		tempStr = (Integer.valueOf(i).toString()+Integer.valueOf(j).toString());
		if(combination.isEmpty())combination.add(tempStr);
		for(String arr : combination){
			if(arr.contains(Integer.valueOf(i).toString()) && arr.contains(Integer.valueOf(j).toString())){
				contain = true;
				break;
			}							
		}
		if(!contain){
			combination.add(tempStr);
		}
	}	
}
