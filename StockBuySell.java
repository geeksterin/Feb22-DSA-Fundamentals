package DsaPrograms;

public class StockBuySell {

	//Task
	// go and check when stock buy and sell for n transaction
	// duplicates in array remove and print
	// 1,34,56,78,12,45,34,45,23,34
	// find minimum in rotated 
	
	// Home work or Assignment 
	//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
	//	https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
	// Array rotation by n
	//   Find the first or last occurrence of a given number in a sorted array
	// two sum input array is sorted
	
	
	// TODAY WE SAW
	// stock buy sell. 
	// finding missing and repeating number.
	// matrix rotation.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep the track of min value
		// keep the track of maxprofit value
		// input
		// 1 TRANSACTION ALLOWED 
		int prices[] = { 1, 2, 4, 3, 7, 3 };

		int smallestSoFar = Integer.MAX_VALUE;
		int maxProfit = 0;
		int profitIfSoldToday = 0;

		for (int i = 0; i < prices.length; i++) {
			// i = 4  price of i = 7
			if (prices[i] < smallestSoFar) { // 7< 1
				// 1
				smallestSoFar = prices[i];
			}
			//
			profitIfSoldToday = prices[i] - smallestSoFar; // 7 - 1 = 6
			// 
			if (profitIfSoldToday > maxProfit) {// 1>0
				//
				maxProfit = profitIfSoldToday; //maxProfit = 1
			}
		}

		System.out.println("maxprofit " + maxProfit);

	}

}
