package com.logic;

public class ConstructorStory {

	public  ConstructorStory() {
		super();
	}

	//concept 1 : private / protected
	//========================================
	/*private  ConstructorStory() {
			super();
		}*/   //This is legal
	/*protected  ConstructorStory() {
	        super();
         }*/  //This is legal



	//concept 2 : final, static, abstract 
	//========================================
	/* final, static, abstract : Not Legal
	 * Illegal modifier for the constructor in type ConstructorStory; only public, protected & private are permitted 
	 */

	/*                             Explanation:
    =================================================================*/
	/*
	 * final keyword is used with methods so that if they are inherited they will not be overridden. 
	 * But as we know constructor are not inherited during inheritance. 
	 * So making it final will be redundant. So making a constructor final is not required, so it is not used with constructor.
	 * 
	 * 
	 * You cannot have an abstract constructor 
	 * because abstract means you must override it in any non-abstract child class and you cannot override a constructor.

	 
    */

}
