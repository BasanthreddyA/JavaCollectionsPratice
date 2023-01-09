//LIST>>>STACK 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Stack<String> animal=new Stack<>();
	    animal.push("lion");
	    animal.push("rabbit");
	    animal.push("camel");
		System.out.println("original stack is "+animal);
		animal.pop();
		System.out.println(animal.peek());
		System.out.println("after prforming the pop operation "+animal);
	}
}

