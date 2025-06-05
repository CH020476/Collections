import java.util.TreeSet;
public class TreSt {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(50);
        ts.add(75);
        System.out.println(ts.ceiling(50));
        System.out.println(ts.floor(50));
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(75));
    }
}
