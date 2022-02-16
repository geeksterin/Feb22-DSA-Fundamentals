package arrayPackageLect1;

public class RotateMatrixBy90 {

	public static void main(String[] args) {
		int n = 3;
		int arr[][] = { { 31, 32, 33, 41},
						{ 64, 65, 66, 42}, 
						{ 97, 98, 99, 43}, 
						{81,82,83,84}};

		System.out.println("Value is (1,1)- " + arr[1][1] + " length is - " + arr.length);
		// Transpose of Matrix
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		// Reverse the rows and column
		for (int i = 0; i < arr.length; i++) {
			int left = 0;
			int right = arr[i].length - 1;
			while (left < right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				right--;
				left++;

			}
		}
		// Print the matrix
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();

		}

	}

}
