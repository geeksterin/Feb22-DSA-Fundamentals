package DsaPrograms;

import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int arr[] = { 12, 34, 14, 56, 78, 1, 87 };
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 0; i < arr.length; i++) {
			queue.add(arr[i]);

		}
		// find 3rd smallest
		System.out.print(" " + queue);
		// [1, 34, 12, 56, 78, 14, 87]

		// [1, 34, 12, 56, 78, 14, 87]
		// queue.peek() will return u 1 and will not make any changes to
		// existing queue
		// [1, 34, 12, 56, 78, 14, 87]

		// queue.poll() will return u 1 and will delete the top element and
		// return the queue
		// [12, 34, 14, 56, 78, 87]

		System.out.println("Peek method " + queue.peek());
		System.out.println("after peek " + queue);
		System.out.println("Poll method " + queue.poll());
		System.out.println("after poll " + queue);

		int kthNum = -1;
		while (k > 0) {
			kthNum = queue.poll();
			k--;
		}

		System.out.println("Kth smallest element is " + kthNum);

	}

}
