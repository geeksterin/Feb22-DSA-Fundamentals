## 					Time and Space Complexity Analysis
-------------------------------------------------------------------------------------------------
 1. Why Time and Space Analysis is required:
	- So that we can rank different algorithms solving the same problem. 
	- The very useful metric used to compare multiple algorithms are:
		- "Time" : Execution Time.
		- "Space": (memory consumption/ memory footrpint) taken by the program.

 2. What does CASE mean in Asymptotic Anaylsis:
	
	- **WORST CASE**: 
	 A input example or a scenario in which your given algorithm performs the worst in wrt to Time and Space is called WORST case. eg For a Linear search algorithm, a input array in which the target is at last index, for such a input case, the algorithm has to go through the entire array, making it work harder to find a answer.

	- **BEST CASE**: 
	 A input example or a scenario in which your given algorithm performs the BEST  wrt to Time and Space is called BEST case. eg For a Linear search algorithm, a input array in which the target is in first index, for such a input case, the algorithm has to just do 1 comparision and it gets the answer.

	- **AVERAGE CASE**:	
	A input example or a scenario in which your given algorithm takes AVERAGE time or Space is called AVERAGE case. eg For a Linear search algorithm, a input array in which the target is present somewhere in middle, for such a input case, the algorithm has to just do roughly half number of comparisions to get the answer.
	
    - **UPPER BOUND**:
		
	-	Lower bound => big Omega
	-	Tight bound => Theta 

### RULES for computing Time Complexity and Space Complexity 
-----------------------------------------------------------------------------------------------------
1. Drop all the constants (C).
2. Only take the highest degree in a polynomial expression.

### 	Calculating Time Complexity in Iterative Code
---------------------------------------------------------------------------------------------------------
###	    Constant Time Complexity aka O(1)
	
	void m1(){
		  int a = 10;
		  int b = 6;
		  int c;
		  c = a + b;
		  print(c);
	}

	static void m2() {
		int a = 5, b = 10;
		int temp = a;
		a = b;
		b = temp;
	}
		
    
### 	Linear Time Complexity aka O(N)	
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


	 for(i = 1; i < n/2; i++){
        // some O(1) expressions
	 }

	 for(i = 1; i<n ; i+=2>){
		 //some constant operations.
	 }

	  for(i = n/2; i < n; i++){
         // some O(1) expressions
	  }

	  
	void m2(){	
	 	for(int i=0;i<1000;i++) {
			// some O(1) expressions
		}
	}

### 	Polynomial Time Complexity 

#### 	Quadratic Time Complexity aka O(N*N)
--------------------------------------------------------------------------------------
	static int m1(int n) {	
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				count = count + 1;
			}
		}
		return count;
	}

	static int m2(int n) {	
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				count = count + 1;
			}
			        
		}
		return count;
	}

[x]	void m3(){	
	 for(int i=0;i<1000;i++) {
		for(int j=0;j<i;j++){
			// some O(1) statment.
		}
	 }
   }

### 	Logrithmic Time Complexity aka O(LgN)
--------------------------------------------------------------------------------------
    for (int i = 1; i <=n; i = i*2) {
        // some O(1) expressions
    }

    for (int i = n; i >= 0; i /= 2) {
        // some O(1) expressions
    }

	static void m5(int n) {
		for(int i=0;i<1000;i++) {
			// some O(1) expressions
		}
		for(int i=0;i<n;i*=2) {
			// some O(1) expressions
		}
	}

	static void m6(int n) {
		for(int i=n;i>0;i=i/c) {
			// some O(1) expressions
		}
	}

	int k = 2;
	for(var i=0;i<n;i++){
		i*=k
	}










### 	Square-Root Time complexity aka O(Sqrt(N))
--------------------------------------------------------------------------------------
		for(int i=0;i<Sqrt(N);i++){
			//some 0(1) stmt
		}

	    for(int i =0;i*i<n;i++){
			//some 0(1) stmt
		}
		
		int p = 0;
		for(int i=1;p<=n;p++){
			p = p+i;
		}

### 	Linear-Arithmetic Time Complexity Class aka O(NlgN)
--------------------------------------------------------------------------------------
		int i, j, k = 0;
		for (i = n / 2; i <= n; i++) {
			for (j = 2; j <= n; j = j * 2) {
				//stmt 
			}
		}

[x]		int i, j, k = 0;
		for (i = n / 2; i <= n; i++) {
			for (j = 2; j <= n; j = j * 2) {
				k = k + n / 2;
			}
		}


### 	Practice Questions:
--------------------------------------------------------------------------------------
1.	static void m7(boolean flag) {
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

2. 	void function(int n){
		int count = 0;
		for (int i=n/2; i<=n; i++){
			for (int j=1; (j+n/2)<=n; j = j++)
				for (int k=1; k<=n; k = k * 2){
					count++;
				}	
			}
		}
	}

3. 	static void m8()
    {
	    int i, j;
	    for (i = 1; i <= n; i++)
		    for (j = 1; j <= log(i); j++)
			System.out.printf("GeeksforGeeks");
        }
    }
    ```
    Stirling’s approximation (or Stirling’s formula). 
    (logn)! = n*log n - n = O(n*log(n)) 

	n!=1. … .n <= n. …. .n = n^n obiously, so log(n!)<=n.log(n)
	n! = 1. … .n >= (n/2)…..n>=(n/2)^(n/2)
	log(n!) >= (n/2)*(log(n)-log(2)) in the same ballpark as n.log(n)
	So O(log(n!)) = O(n.log(n))
    ```
--------------------------------------------------------------------------------------


### Quiz on Asymtotic analysis:      
- https://www.geeksforgeeks.org/practice-questions-time-complexity-analysis/
- https://www.geeksforgeeks.org/analysis-algorithms-set-5-practice-problems/ 
- https://www.youtube.com/watch?v=Q_1M2JaijjQ 