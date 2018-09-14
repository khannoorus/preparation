package com.internal.implementation;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestMapImplementation {

	 @Test
	    public void testCustomMap() {

	        // MyMap
	        MyMap<String, Integer> map = new MyMap<String, Integer>();
	        map.put("Lars", 1);
	        map.put("Lars", 2);
	        map.put("Lars", 1);
	        assertEquals(map.get("Lars"), Integer.valueOf(1));
	        for (int i = 0; i < 100; i++) {
	            map.put(String.valueOf(i), i);
	        }
	        assertEquals(map.size(), 101);
	        assertEquals(map.get("51"), Integer.valueOf(51));

	    }
	 
    @Test
    public void testStandardMap() {
        // Standard Map
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Lars", 1);
        map.put("Lars", 2);
        map.put("Lars", 1);
        assertEquals(map.get("Lars"), Integer.valueOf(1));
        

        for (int i = 0; i < 100; i++) {
            map.put(String.valueOf(i), i);
        }
        assertEquals(map.size(), 101);

        assertEquals(map.get("51"), Integer.valueOf(51));
    }

   


}

