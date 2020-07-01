
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList<String> ll=new LinkedList<String>();
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
        System.out.println("size of ll:"+ll.size());
        System.out.println("elements in linked list are:"+ll);
        ll.addFirst(4);
        System.out.println("elements in linked list are:"+ll);
        ll.add(3,5);
        System.out.println("elements in linked list are:"+ll);
        Collections.sort(ll);
        System.out.println("elements in linked list are:"+ll);
        //ll.remove(1);
       // System.out.println("elements in linked list are:"+ll);
        ll.remove(1);
        System.out.println("elements in linked list are:"+ll);
        ll.removeFirst();
        System.out.println("elements in linked list are:"+ll);
        System.out.println("size of ll:"+ll.size());
	}

}
