package com.logic;

public class SingletonEnumTest {

	public static void main(String[] args) {
		//Get the instance and set some value and print it
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		singleton.setValue(1);
		System.out.println(" singleton : "+singleton.getValue());

		//Get the instance and set some value and print it
		SingletonEnum singleton1 = SingletonEnum.INSTANCE;
		singleton1.setValue(2);
		System.out.println(" singleton1 : "+singleton1.getValue());

		System.out.println("now again print the first instance (singleton), it should give value 1  "+"\n"+"but it is printing 2 eventhough, 2 being set in other instance (singleton1) "+"\n"+"this will proov that eventhough singleton1 is the new instance, we had requested but actually we got the previous constructed instance only"+"\n"+"and when later on we did modify this new instance that actually got modified the first instance as well,"+"\n"+"because firstinstance(singleton) and secondinstance(singleton1) was same.");
		System.out.println("Reprinting singleton : "+singleton.getValue());
	}

}


enum SingletonEnum {
	INSTANCE;
	int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

