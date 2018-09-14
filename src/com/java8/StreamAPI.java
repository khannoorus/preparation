package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Noorus");list.add("Faizan");list.add("Zishan");list.add("RRiyaz");
		list.forEach(System.out::println);
		 
		System.out.println(".............use filter.................");
		Stream<String> stream = list.stream();
		Stream<String> strea = stream.filter(c->c.contains("a"));
		strea.forEach(System.out::println);
		
		System.out.println("..............collect in list................");
		List<String> strList = list.stream().collect(Collectors.toList());		
		strList.forEach(System.out::println);		
		//direct chaining
		list.stream().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("...............collect in map...............");
		Map<String, Object> map = list.stream().collect(Collectors.toMap(Function.identity(), s->s));
		map.forEach((k,v)->System.out.println("KEY - "+k+"  ::  "+" VALUE - "+v));
		
		System.out.println("...............optional and findAny()...............");
		Optional<String> opt = list.stream().filter(e->e.contains("a")).findAny();
		System.out.println(opt.toString());
		
		System.out.println("...............optional and findFirst()...............");
		Optional<String> opt1 = list.stream().filter(e->e.contains("a")).findFirst();
		System.out.println(opt1.toString());		
		//directly convert into string, direct chaining
		String optStr = list.stream().filter(e->e.contains("a")).findFirst().toString();
		System.out.println(optStr);
		
		boolean allMatchflag = list.stream().allMatch(e->e.contains("Fa"));
		boolean anyMatchflag = list.stream().anyMatch(e->e.contains("Fa"));
		boolean noneMatchflag = list.stream().noneMatch(e->e.contains("Fa"));
		System.out.println("allMatchflag "+ allMatchflag +" anyMatchflag "+ anyMatchflag +" noneMatchflag "+ noneMatchflag);
		
		System.out.println("...............iterate()...............");
		//5 is the initial value, provide limit else it will iterate infinitely
		Stream.iterate(1, i->i+2).limit(10).forEach(System.out::println);
		
		
		
		
	}
}
