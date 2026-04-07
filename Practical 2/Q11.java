import java.util.ArrayList;
import java.util.Collections;

public class Q11 {
    public static void main(String[] args) {
        ArrayList <Integer> o = new ArrayList<>();
        o.add(10);
        o.add(20);
        o.add(30);
        o.add(40);

        Collections.sort(o);
        System.out.println(o);
        Collections.sort(o,Collections.reverseOrder());
        System.out.println(o);
    }
}