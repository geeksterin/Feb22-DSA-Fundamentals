package DsaPrograms;

public class SqrtOfNum {

	public static int findSquareRoot(int num) { // 25

		// base case when 0 and 1
		if (num == 0 || num == 1) {
			return num;
		}

		// int start and end
		int start = 1;
		int end = num;
		int result = 0;

		while (start <= end) { //15
			int mid = (start + end) / 2; // mid 2 num 15
			if (mid * mid == num) {
				return mid;
			} 
			
			if (mid * mid < num) {// 16 < 15
				start = mid + 1;          // 3 < 15 
				result = mid;  
			
			} else { // mid * mid > num
				end = mid - 1;       // mid 
				      // result 3 
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int srqtValue = findSquareRoot(25);
		System.out.println("Value of srqt is :   " + srqtValue);
		
	}

}
