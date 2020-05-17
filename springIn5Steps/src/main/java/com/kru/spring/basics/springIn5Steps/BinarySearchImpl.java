package com.kru.spring.basics.springIn5Steps;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	@Qualifier("quick")
	SortAlgorithm bubbleSortAlgorithm;
	
	
	public SortAlgorithm getSortAlgorithm() {
		return bubbleSortAlgorithm;
	}

	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.bubbleSortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		// Search the array
		return 3;
	}
	
	@PostConstruct
	public void postCosntruct() {
		System.out.println("Post Construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre Destroy");
	}
	
}
