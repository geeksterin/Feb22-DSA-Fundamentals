public class removeDupliacateChars {
    public static boolean map[] = new boolean[26];

    static void removeDuplicates(String s, int idx, String newString) {

        if (idx == s.length()) {
            System.out.println(newString);
            return;
        }

        if (map[s.charAt(idx) - 'a'] == false) {
            newString += s.charAt(idx);
            map[s.charAt(idx) - 'a'] = true;
            removeDuplicates(s, idx + 1, newString);
        } else {
            removeDuplicates(s, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = "aabcdeeeezy";
        removeDuplicates(s, 0, "");

    }

}
