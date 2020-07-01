import java.util.*;
public class ArrayListExample {

	public ArrayListExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
        System.out.println("size of a:"+a.size());
        System.out.println("elements in array list are:"+a);
        a.add(1,4);
        a.add(3,5);
        System.out.println("elements in array list are:"+a);
        Collections.sort(a);
        System.out.println("elements in array list are:"+a);
        a.remove(1);
        System.out.println("elements in array list are:"+a);
	}

}
