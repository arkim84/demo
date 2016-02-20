package com.example.DataStructure;

import java.util.NavigableSet;
import java.util.TreeSet;

import org.springframework.util.StopWatch;

public class TreeSetExample {
	
	public static void main(String args[]) {
		
		StopWatch stopWatch = new StopWatch("TreeSet");
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(85));
		scores.add(new Integer(88));
		scores.add(new Integer(90));
		
//		stopWatch.start("TreeSet");		    
//
//		System.out.println("lowest: "+ scores.first());
//		
//		System.out.println("highest: "+ scores.last());
//		
//		System.out.println("95 아래 :"+ scores.lower(new Integer(95)));
//		
//		System.out.println("85 위: "+ scores.higher(new Integer(85)));
//		
//		System.out.println("95 이거나 바로 아래: "+ scores.floor(new Integer(95)));
//		
//		System.out.println("85 이거나 바로 아래: "+ scores.ceiling(new Integer(85)));
//		
//		stopWatch.stop();
//	    
//	    System.out.println(stopWatch.toString());
		
//		NavigableSet<Integer> desendingSet = scores.descendingSet();
//		System.out.println("내림차순 정렬:" +desendingSet);
//		System.out.println("오름차순 정렬:" +desendingSet.descendingSet());
		
		NavigableSet<Integer> headSet = scores.headSet(87, true);
		NavigableSet<Integer> tailSet = scores.tailSet(87, true);
		System.out.println(headSet);
		System.out.println(tailSet);
		
	}

}
