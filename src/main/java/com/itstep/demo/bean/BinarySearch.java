package com.itstep.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope(value = "prototype")
//prototype or singleton
public class BinarySearch {

	@Autowired
	 private SortAlgorithm sortAlgorithm;

//	
//	 public BinarySearch(SortAlgorithm al) {
//		 this.sortAlgorithm = al;
//	 }
	 
	public int searchBinary(int[] array, int target) {
		
		//BubbleSortImpl bubbleSort = new BubbleSortImpl();
		
		//bubbleSort.sort();
		
		
		this.sortAlgorithm.sort();
		
		System.out.println(sortAlgorithm);
		
		//choose sort algorithm
		
		//apply search
		
		
		return 1;
	}
	
}
