package com.bl.project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 3, 3, 7, 4, 10, 9);
		List<Integer> num = numbers.stream().map(x -> (x * x)).distinct().collect(Collectors.toList());
		System.out.println(num);
	}
}