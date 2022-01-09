package com.group.springframework.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortingAlgorithm {

	public int[] sort(int[] nums) {
		return null;
	}
}