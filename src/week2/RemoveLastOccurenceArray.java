package week2;

import java.util.Arrays;

public class RemoveLastOccurenceArray {
	/**
	   * Takes the array and the last occurring element x,
	   * shifting the rest of the elements left. I.e.
	   * [1, 4, 7, 9], with x=7 would result in:
	   * [1, 4, 9].
	   *
	   * @param x
	   *     the entry to remove from the array
	   * @param arr
	   *     to remove an entry from
	   * @return the updated array, without the last occurrence of x
	   */
	  public static int[] removeLastOccurrence(int x, int[] arr) {
	    if(arr == null) return null;
			if(arr.length == 0) return new int[0];
			 
			for (int i = arr.length - 1; i >= 0; i--) {
				if (arr[i] == x) {
					for (int j = i + 1; j < arr.length; j++) {
						arr[j - 1] = arr[j];
					}
					arr = Arrays.copyOf(arr, arr.length - 1);
					break;
				}
			}
			
			return arr;
			 
		}
}
