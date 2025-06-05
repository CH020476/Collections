import java.util.LinkedList;
class LL {
    public static void main(String[] args) {
        LinkedList<Object> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add("hello");
        l1.add(false);
        l1.add('a');
        l1.addAll(l2); 
        l1.add(10);

        System.out.println("Initial l1: " + l1);

        l1.remove("hello"); 
        System.out.println("After removing 'hello': " + l1);

        System.out.println("Contains 10? " + l1.contains(10));
        System.out.println("Is list empty? " + l1.isEmpty());
        System.out.println("Size of list: " + l1.size());

        System.out.println("Elements in the list:");
        for (Object item : l1) {
            System.out.println(item);
        }
    }
}
