import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;
public class Iterato {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
        hm.put(1, "Dhoni");
        hm.put(2, "Rohit");
        hm.put(3, "Virat");
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
