package DsaPrograms;

import java.util.Arrays;

public class SortingColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputArray[] = {0,2,2,1,1,0,0,2,1,2};
		int start = 0;        
		int end = inputArray.length - 1; // 9
		for(int i = 0;i<=end;i++){
			if(inputArray[i] == 0)
			{
				int tempVar = inputArray[i];
				inputArray[i] = inputArray[start]; // 
				inputArray[start] = tempVar;
				start++;
				
			}else if(inputArray[i] == 2){
				int tempVar = inputArray[i];
				inputArray[i] = inputArray[end];
				inputArray[end] = tempVar;
				end--;
				i--;
			}
		}
		
		System.out.println("Color sorting algo " + Arrays.toString(inputArray));
		
		

	}

}
