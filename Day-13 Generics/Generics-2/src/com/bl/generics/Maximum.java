package com.bl.generics;

public class Maximum {

	public void maxInt(float first1, float second1, float third1) {
	}
	public void maxFloat(Float first, Float second, Float third) {
		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
			System.out.println("First Element is Greatest");
		} else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			System.out.println("Second Element is Greatest");
		} else {
			System.out.println("Third Element is Greatest");
		}
	}
	public void maxInt1(float first1, float second1, float third1) {
		// TODO Auto-generated method stub

	}

}