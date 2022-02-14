public class atoi {
    public static void main(String[] args) {
        String s = "2352";
        char arr[] = s.toCharArray();

        for (int i = 0; i < arr.length; i++)
            System.out.print((arr[i] - '0'));

        // "-12412" -> 12412 (int)
        // "+12412"
        // " 12412 "
        // "12412A" -> not valid number.
        // "12412 241" -> concat 12412241 (int)
        // "12412#241" -> not valid number.

    }
}
