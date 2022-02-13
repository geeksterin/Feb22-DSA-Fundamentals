## Time and Space Complexity in Iterative Code.
------------------------------------------------------------
 1. Why Time and space Analysis: 
 2. Case defination : worst, best, average eg:linear search, sorting 
 3. Why asymtotic notation required and their terms.
    - 	Upper bound => big O 
	-	Lower bound => big Omega
	-	tight bound => Theta 

--------------------------------------------------------------------------------------
	void m1(){
		  int a = 4;
		  int b = 6;
		  int c;
		  c = a + b;
		  System.out.println(c);
	}
--------------------------------------------------------------------------------------
	static void m2() {
		int a = 5, b = 10;
		int temp = a;
		a = b;
		b = temp;
	}
    

--------------------------------------------------------------------------------------
	int count(int arr[], int n)
	{
	  int sum = 0, i;
	  for(i = 0; i < n; i++){
	     sum = sum + arr[i];
         // some O(1) expressions
	  }
	  return sum;
	}
--------------------------------------------------------------------------------------
	static int m3(int n) {	
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				count = count + 1;
			}
			        
		}
		return count;
	}

--------------------------------------------------------------------------------------
	static void m4(int n) {
		int a = 10;
		a = a+5;
		
		for(int i=0;i<a;i++) {
			// some O(1) expressions
		}
		
		for(int i=0;i<n;i++) {
			// some O(1) expressions
		}
	}
--------------------------------------------------------------------------------------
### O(LgN):
        for (int i = 1; i <=n; i *= c) {
            // some O(1) expressions
        }

        for (int i = n; i > 0; i /= c) {
            // some O(1) expressions
        }
--------------------------------------------------------------------------------------
	static void m5(int n) {
		
		for(int i=0;i<1000;i++) {
			// some O(1) expressions
		}
		
		for(int i=0;i<n;i*=2) {
			// some O(1) expressions
		}
	}

--------------------------------------------------------------------------------------
	static void m6(int n) {
		
		for(int i=n;i>0;i=i/3) {
			// some O(1) expressions
		}
	}
	
--------------------------------------------------------------------------------------
	static void m7(boolean flag) {
		if(flag) {
			for(int i=0;i<100;i++) {
				// some O(1) expressions
				for(int i1=10;i1<1000;i1++) {
					// some O(1) expressions
				}
			}
		}
		else {
			Scanner s = new Scanner(System.in);
			int x = s.nextInt();
			for(int i=0;i<x;i++) {
				// some O(1) expressions
			}
		}
	}
--------------------------------------------------------------------------------------
	static void m8()
    {
	    int i, j;
	    for (i = 1; i <= n; i++)
		    for (j = 1; j <= log(i); j++)
			System.out.printf("GeeksforGeeks");
        }
    }
    ```
    Stirling’s approximation (or Stirling’s formula). 
    log n! = n*log n - n = O(n*log(n)) 
    ```
--------------------------------------------------------------------------------------
### Quiz on Asymtotic analysis:      
- https://www.geeksforgeeks.org/practice-questions-time-complexity-analysis/