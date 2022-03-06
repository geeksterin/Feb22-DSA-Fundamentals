package DsaPrograms;

import java.util.Arrays;

public class SortingColorsJavaDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = { 0, 2, 2, 1, 2, 0, 0, 1, 1, 2 };
		int start = 0;
		int end = inputArray.length - 1;
		for (int i = 0; i <= end; i++) {
			if (inputArray[i] == 0) {
				int tempVar = inputArray[i];
				inputArray[i] = inputArray[start];
				inputArray[start] = tempVar;
				start++;

			} else if (inputArray[i] == 2) {
				int tempVar = inputArray[i];
				inputArray[i] = inputArray[end];
				inputArray[end] = tempVar;
				end--;
				i--;// since position is not fixed so will have to do recheck to ensure that element is at right place. 
			}

		}
		
		System.out.println("Sorted array : " + Arrays.toString(inputArray));

	}

}
