import java.util.*;


public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				HashSet<Integer> hashset=new HashSet<Integer>();
				hashset.add(1);
				hashset.add(2);
		        System.out.println("size of hashset:"+hashset.size());
		        System.out.println("elements in hashset are:"+hashset);
		        hashset.add(4);
		        System.out.println("elements in hashset are:"+hashset);
		        hashset.add(5);
		        System.out.println("elements in hashset are:"+hashset);
		        System.out.println("elements in hashset are:"+hashset);
		        //hashset.remove(1);
		       // System.out.println("elements in hashset list are:"+hashset);
		        hashset.remove(1);
		        System.out.println("elements in hashset are:"+hashset);
		        hashset.remove(1);
		        System.out.println("elements in hashset are:"+hashset);
		        System.out.println("size of hashset:"+hashset.size());

	}

}
 