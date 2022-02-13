
import java.util.*;

class Pair {
    int a;
    int b;

    Pair(int _a, int _b) {
        a = _a;
        b = _b;
    }
}

public class CustomObjectSorting {

    static void m2() {
        ArrayList<Pair> list = new ArrayList<>();
        
        list.add(new Pair(1, 2));
        list.add(new Pair(3, 4));
        list.add(new Pair(3, 6));
        list.add(new Pair(2, 5));

        Collections.sort(list, (x, y) -> {
             if(x.a<y.a) 
                return -1;
             if(x.a == y.a && x.b<y.b)
                return 1;
            return 0;
        });

        for (Pair x : list) {
            System.out.println(x.a + ","+x.b);
        }


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        m2();

    }

}