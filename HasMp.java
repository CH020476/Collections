import java.util.HashMap;
public class HasMp {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "Dhoni");
        hm.put(2, "Rohit");
        hm.put(3, "Virat");
        System.out.println(hm);
        System.out.println(hm.get(1));
    }
    
}
