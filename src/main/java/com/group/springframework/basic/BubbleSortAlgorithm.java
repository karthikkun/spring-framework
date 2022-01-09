package com.group.springframework.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSortAlgorithm implements SortingAlgorithm{

	public int[] sort(int[] nums) {
		return null;
	}
}
