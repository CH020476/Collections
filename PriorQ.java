import java.util.PriorityQueue;
public class PriorQ {
    public static void main(String[] args) {
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.poll();
        System.out.println(pq);
    }
}
