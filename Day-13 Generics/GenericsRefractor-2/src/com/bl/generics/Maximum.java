package com.bl.generics;

public class Maximum {

	public void maxInt(Integer first, Integer second, Integer third) {
		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
			System.out.println("First Element is Greatest");
		} else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			System.out.println("Second Element is Greatest");
		} else {
			System.out.println("Third Element is Greatest");
		}
	}
	public class Maximum <T extends Comparable<T>> {

		public void maxFloat(Float first, Float second, Float third) {
			if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
				System.out.println("First Element is Greatest");
			} else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
				System.out.println("Second Element is Greatest");
			} else {
				System.out.println("Third Element is Greatest");
			}
		}
		T first;
		T second;
		T third;

		public void maxString(String first, String second, String third) {
			if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
				System.out.println("First Element is Greatest");
			} else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
				System.out.println("Second Element is Greatest");
			} else {
				System.out.println("Third Element is Greatest");
			}
		}

		public <T extends Comparable<T>> void findMax(T first, T second, T third) {
			if (first.compareTo(second) >= 0 && third.compareTo(second) >= 0) {
				System.out.println("First Element is Largest");
			} else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			}
			else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
				System.out.println("Second Element is Largest");
			} else 
			{
				System.out.println("Third Element is Largest");
			}
		}

		public void findMax() {
			findMax(this.first, this.second, this.third);
		}


		public Maximum(T first, T second, T third) {
			super();
			this.first = first;
			this.second = second;
			this.third = third;

		}
	}
}