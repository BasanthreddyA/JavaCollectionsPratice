import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Map<String,Integer> h=new LinkedHashMap<>(Compartor.reverseOrder());//
	    h.put("one",1);
	    h.put("two",2);
	    h.put("threee",3);
	    h.put("basanth",4);
	    
	    h.putIfAbsent("three",33);
	     for (String key: h.keySet()) {
           System.out.println(key);
        }
       System.out.println(h);
       System.out.println(h.containsValue(3));//it checks  the weather number is present in the Map.
       
}
}
