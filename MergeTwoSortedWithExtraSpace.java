package DsaPrograms;

import java.util.Arrays;

public class MergeTwoSortedWithExtraSpace {

	// Todays assigmnment
	// Bubble sort read and wirte the program
	// Read about Insertion and Selection sorting algorithm
	// https://www.youtube.com/watch?v=i-SKeOcBwko&t=204s
	// https://www.youtube.com/watch?v=Jdtq5uKz-w4 
	// Two sum problem from leetcode 
	
	
	public static void main(String[] args) {
		// both the input array will be sorted
		int arr1[] = { 12, 34, 56, 78, 789, 890 };// 6
		int arr2[] = { 4, 34, 188, 490, 1000 };// 5
		
		int arr3[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;

			} else {
				arr3[k] = arr2[j];
				k++;
				j++;

			}
		}

		while (i < arr1.length) {
			arr3[k] = arr1[i];
			k++; i++;
			

		}

		while (j < arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;

		}

		System.out.println(Arrays.toString(arr3));

	}

}
