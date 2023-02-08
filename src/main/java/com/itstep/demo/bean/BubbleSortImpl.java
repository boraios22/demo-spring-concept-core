package com.itstep.demo.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BubbleSortImpl implements SortAlgorithm {
	public void sort() {
		System.out.println("Sort using BubbleSortImpl");
	}
}
