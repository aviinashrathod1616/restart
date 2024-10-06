package com.restart;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortTheLineBased {
	public static void main(String[] args) {
		
		String input="India is my country";
		
		String output=Arrays.stream(input.split(" "))
				.sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.joining(" "));
		
		System.out.println(output);
				
		
	}
	

}
