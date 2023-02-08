package com.itstep.demo.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Primary
@Scope("prototype")
public class QuickSortImpl implements SortAlgorithm{
	public void sort() {
		System.out.println("Sort using QuickSortImpl");
	}
}
