package com.mani.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier("Quick")
public class QuickSortAlgo implements SortAlgorithm {
	public int[] sort(int[] numbers)
	{
			//Quick sort logic
		return numbers;
	}


}
