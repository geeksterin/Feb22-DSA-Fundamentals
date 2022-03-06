package DsaPrograms;

public class FindNumPowOf2 {

	public static boolean findPowOfTwo(int inputNum) {

		if (inputNum == 0) {
			return false;
		}

		while (inputNum != 1) { // entered 
			// its not a pow of two
			if (inputNum % 2 != 0) {// entered will give 0 
				return false;
			}
			inputNum = inputNum / 2;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (findPowOfTwo(32)) {
			System.out.println("yes pow of 2");
		} else {
			System.out.println("not pow of 2");
		}

	}

}
