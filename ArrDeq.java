import java.util.ArrayDeque;
public class ArrDeq {
    public static void main(String[] args) {
        ArrayDeque <Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(10);
        ad.addFirst(20);
        ad.addLast(30);
        ad.removeFirst();
        System.out.println(ad);
    }
}
