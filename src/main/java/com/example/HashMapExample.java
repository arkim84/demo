package com.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "test"), 95);
		map.put(new Student(1, "test"), 95);
		
		System.out.println("총 Entry: "+map.size());
	}

}
