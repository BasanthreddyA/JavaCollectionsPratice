
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Map<String,Integer> h=new HashMap<>();
	    h.put("one",1);
	    h.put("two",2);
	    h.put("threee",31);
	    
	    h.putIfAbsent("three",33);
	     for (String key: h.keySet()) {
           System.out.println(key);
        }
        System.out.println(h.getValue());
}
}
