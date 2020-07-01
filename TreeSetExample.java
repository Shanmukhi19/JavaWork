import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String>ts=new TreeSet<String>();
        ts.add("add");
        ts.add("tree");
        ts.add("set");
        ts.add("elements");
        System.out.println("elements in treeset:"+ts);
        ts.add("apple");
        ts.add("banana");
        System.out.println("elements are:"+ts);
        System.out.println("size of tree set:"+ts.size());
        for(String s:ts)
        	System.out.println(s);
	}

}
