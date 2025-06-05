import java.util.LinkedHashMap;
public class Lhm {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("Root", 1);
        lhm.put("Stokes", 3);
        lhm.put("Roy", 2);
        
        System.out.println(lhm);
        System.out.println(lhm.get("Stokes"));
    }
    
}
