
public class MoveAllXsToEnd {
	static void moveX(String s, int idx, int count, String newString) {
		// Base case
		if (idx == s.length()) {
			while (count > 0) {
				newString += 'x';
				--count;
			}
			System.out.println(newString);
			return;
		}

		if (s.charAt(idx) == 'x') {
			count++;
		} else {
			newString += s.charAt(idx);
		}
		moveX(s, idx + 1, count, newString);
	}

	public static void main(String[] args) {

		String s = "abxdxxefx";
		moveX(s, 0, 0, "");
	}

}
