package collectionframework2;

import java.util.ArrayList;
import java.util.Collections;

public class a3 {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(21);
        s.add(26);
        s.add(81);
        s.add(51);
        Collections.reverse(s);
        System.out.println(s);
    }
}
