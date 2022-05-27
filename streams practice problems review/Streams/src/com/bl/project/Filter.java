package com.bl.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("INDIA");
		al.add("US");
		al.add("INDIA");
		al.add("GERMANY");
		al.add("UK");
		al.add("US");
		al.add("INDIA");
		System.out.println(al);
		List<String> newAl = al.stream().filter(x -> x.contains("INDIA")).collect(Collectors.toList());
		System.out.println(newAl);
	}
}
