/*
 *	@author Kevin Singh
 *	
 * This class is an example of empirical analysis in a simple algorithm.
 * It computes the range of numbers in an array, where range is the difference
 *		between the lowest and highest numbers in the array.
 *
 */

import java.lang.Math;

public class ArrayRange {

	public static void main(String[] args) {
		int[] numbers = new int[100000];
		for(int i = 0; i < 100000; i++){
			numbers[i] = i * (i*2);
			//System.out.println(numbers[i] + " ");
		}

		long startTime = System.nanoTime();
		range1(numbers);
		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("Range1 took " + elapsedTime + " nanoseconds OR " + 
			elapsedTime/1000000000 + " seconds.");


	}	

	// Double for loop >> O(n^2). 
	public static int range1(int[] numbers) {
		int maxDiff = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				int diff = Math.abs(numbers[j] - numbers[i]);
				maxDiff = Math.max(maxDiff, diff);
			}
		}
		return maxDiff;
	}

}