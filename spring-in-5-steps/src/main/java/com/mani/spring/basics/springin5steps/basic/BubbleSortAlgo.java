package com.mani.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Bubble")
public class BubbleSortAlgo implements SortAlgorithm{
	public int[] sort(int[] numbers)
	{
		return numbers;
	}


}
