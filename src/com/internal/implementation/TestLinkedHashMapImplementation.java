package com.internal.implementation;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class TestLinkedHashMapImplementation {

	LinkedHashMapCustom<Integer, Integer> linkedHashMapCustom = new LinkedHashMapCustom<Integer, Integer>();

	@Before
	public void setup(){
		linkedHashMapCustom.put(21, 12);
		linkedHashMapCustom.put(25, 121);
		linkedHashMapCustom.put(30, 151);
		linkedHashMapCustom.put(33, 15);
		linkedHashMapCustom.put(35, 89);
	}


	@Test
	public void testPutMethod() {
		//todo    	
	}

	@Test
	public void testGetMethod() {
		//todo    	
	}

	@Test
	public void testRemoveMethod() {
		//todo
	}




}

