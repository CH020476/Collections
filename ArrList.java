import java.util.ArrayList;
class ArrList {
    public static void main(String[] args) {
        ArrayList<Object> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        al1.add("hello");
        al1.add('c');
        al1.add(true);
        al1.addAll(al2); 
        al1.add(10);
        System.out.println("al1 after additions: " + al1);
    }
}
