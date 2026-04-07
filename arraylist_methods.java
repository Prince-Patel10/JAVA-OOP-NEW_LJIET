import java.util.*;
public class arraylist_methods {
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

        System.out.println("Elements on 1st index is "+o.get(1));
        o.set(4, 50);
        System.out.println(o);
        o.remove(4);
        
    }
}
