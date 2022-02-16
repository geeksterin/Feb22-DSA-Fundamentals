package arrayPackageLect1;

public class ReapeatMissing {
	
	 static void printElements(int arr[], int size)
	    {
	        int i;
	        System.out.print("The repeating element is ");
	  
	        for (i = 0; i < size; i++) {
	            int abs_val = Math.abs(arr[i]);
	            if (arr[abs_val - 1] > 0)
	                arr[abs_val - 1] = -arr[abs_val - 1];
	            else
	                System.out.println(abs_val);
	        }
	  
	        System.out.print("And the missing element is ");
	        for (i = 0; i < size; i++) {
	            if (arr[i] > 0)
	                System.out.println(i + 1);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
	        int n = arr.length;
	        printElements(arr, n);

	}

}
