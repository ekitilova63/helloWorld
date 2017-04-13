package com.udemy.app;

public class Test {
	public static void main(String[] args) {
		long number1 = System.currentTimeMillis();
		for (int k = 0; k < 1000000000; k++) {

			int arr[] = new int[] { 1, 2, 3, 4, 4, 5, 6, 8, 9, 15, 18, 33, 42, 56, 76, 123, 234, 433, 455, 566, 788,
					888, 999 };
			int sum = 37;
			int i = 0;
			int j = arr.length - 1;
			int numberOfIterations = 0;

			while (arr[j] > sum) {
				j--;
			}

			while (i < j) {
				if (arr[i] + arr[j] == sum) {
					numberOfIterations++;
//					System.out.println(
//							arr[i] + " + " + arr[j] + " = " + sum + " numberOfIterations= " + numberOfIterations);
					break;
				} else if (arr[i] + arr[j] > sum) {
//					System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));
					numberOfIterations++;
					j--;

				} else

				{
//					System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));
					numberOfIterations++;
					i++;
				}
			}
		}
		System.out.println(System.currentTimeMillis() - number1);
	}
}
