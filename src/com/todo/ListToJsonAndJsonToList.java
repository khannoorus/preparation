package com.todo;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ListToJsonAndJsonToList {
	
	public List<Product> ConvertJsonToList(String jsonString)  {
		
		Type t = new TypeToken<ArrayList<Product>>() {}.getType();
        return new Gson().fromJson(jsonString, t);		
		
	}

	public String ConvertListToJson(List<Product> pList)   {
		
	    Gson g = new Gson();
	    String jsonString = g.toJson(pList);
	    
		return jsonString;

	}
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.id=1;
		p1.name="noorus";
		
		Product p2 = new Product();
		p2.id=2;
		p2.name="tariq";
		
		List<Product> pList = new ArrayList<Product>();
		pList.add(p1);
		pList.add(p2);
		
		String jsonString =new ListToJsonAndJsonToList().ConvertListToJson(pList);
		System.out.println(jsonString);
		
		 List<Product> list= new ListToJsonAndJsonToList().ConvertJsonToList(jsonString);
		 for(Product p: list){
			 System.out.println(p.getId()+" "+p.getName());			 
		 }		
	}
}


class Product{
	
	String name;
	int id;
	
	public Product() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}

