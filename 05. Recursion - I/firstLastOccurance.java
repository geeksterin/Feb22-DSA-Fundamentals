public class firstLastOccurance {

    static int first = -1;
    static int last = -1;

    static void findFirstLast(String s, int idx, char x) {
        if (idx == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (s.charAt(idx) == x) {
            if (first == -1) {
                first = idx;
            } else
                last = idx;
        }
        findFirstLast(s, idx + 1, x);
    }

    public static void main(String[] args) {
        String str = "abcdefabcdef";
        findFirstLast(str, 0, 'a');

    }

}
