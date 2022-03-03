package lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class a7 {
    public static String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        Consumer <Map.Entry>  c=(i)-> sb.append(i.getKey()).append(i.getValue());
        Set< Map.Entry <String, Integer> > s  = map.entrySet();
        s.forEach(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();
        m.put("priyanshi",11);
        m.put("singh",12);
        m.put("gaur",13);
        Consumer k = (i) -> System.out.println(convertKeyValueToString(m));
        k.accept(m);
    }

}