package week1;

class MergeTwoArrays {

	/**
	 * Merges two sorted arrays such that the resulting array has all elements from
	 * both arrays and is also sorted. Assumes that the elements in the given arrays
	 * are sorted in non-decreasing order. If there are duplicate elements in the
	 * input arrays, these should also be present in the resulting array. If both
	 * arrays are null the result should be null, or a copy of the non-null array if
	 * only one is null.
	 *
	 * Efficiency requirements: merge the two arrays in a single pass.
	 *
	 * @param arr1 first sorted array to be merged
	 * @param arr2 second sorted array to be merged
	 * @return sorted array containing all elements from both arrays
	 */
	public static int[] merge(int[] arr1, int[] arr2) {
		if(arr1 == null && arr2 == null) return null;
	    if(arr1 == null) arr1 = new int[]{};
	    if(arr2 == null) arr2 = new int[]{};
	    
	    int[] mergedArray = new int[arr1.length + arr2.length];
			int i = 0, j = 0, k = 0;
			
			while (i < arr1.length && j < arr2.length) {
				if (arr1[i] < arr2[j]) {
					mergedArray[k] = arr1[i];
					i++;
				} else {
					mergedArray[k] = arr2[j];
					j++;
				}
				k++;
			}

				// Copy the remaining elements in array 1 to array 3
				while (i < arr1.length) {
					mergedArray[k] = arr1[i];
	        i++;
	        k++;
				}

				// Copy the remaining elements in array 2 to array 3
				while (j < arr2.length) {
					mergedArray[k] = arr2[j];
	        j++;
	        k++;
				}
				
				return mergedArray;
			}
}
