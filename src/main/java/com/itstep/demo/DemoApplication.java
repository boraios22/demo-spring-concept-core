package com.itstep.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.itstep.demo.bean.BinarySearch;
import com.itstep.demo.bean.BubbleSortImpl;
import com.itstep.demo.bean.QuickSortImpl;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
//		BinarySearch binarySearch = new BinarySearch(new BubbleSortImpl());
//		
//		int[] array = {1,3,4,5};
//		
//		int result = binarySearch.searchBinary(array, 10);

		
		
		ConfigurableApplicationContext applicationContext 
		= SpringApplication.run(DemoApplication.class, args);
		
		
		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);
		BinarySearch binarySearch2 = applicationContext.getBean(BinarySearch.class);
		
		System.out.println(binarySearch1);
		System.out.println(binarySearch2);
		
		
		
		int[] array = {1,3,4,5};
		int result1 = binarySearch1.searchBinary(array, 10);
		int result2 = binarySearch2.searchBinary(array, 10);
		
		
	}

}
