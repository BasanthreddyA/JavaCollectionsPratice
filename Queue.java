import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Queue<Integer> h=new PriorityQueue<>();
	    for(int i=0;i<10;i++){
	        h.offer(i);
	    }
	    Queue<Integer> k=new PriorityQueue<>(Comparator.reverseOrder());
	    
		System.out.println(h.poll());
		System.out.println(h.peek());
		System.out.println(h);
		for(int i=;i<10;i++){
	        k.offer(i);
	    }
		
		System.out.println(k);
	}
}

