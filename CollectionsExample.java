import java.util.*;
class CollectionAlgs
{
	  public static void main(String args[])
	{ 
		 LinkedList<Integer> ll=new LinkedList<Integer>();
		 ll.add(-8); 
		 ll.add(20);
		 ll.add(-20);
		 ll.add(8);
		  //crate reverse order comparator
		  Comparator<Integer> r=Collections.reverseOrder();
		  System.out.print("List : ");
		  for(int i : ll)
			System.out.print(i+ "");
		   System.out.println();  
		  //Sort list by using comparator
		  Collections.sort(ll,r);
		  System.out.print("List sorted in reverse: ");
		  for(int i : ll)	
			System.out.print(i+ "");
		  System.out.println();
		  //shuffle list
		 Collections.shuffle(ll);
		 System.out.print("List after shuffle ");
		 for(int i: ll)
			System.out.print(i+"");
		System.out.println();
		System.out.println("Minimum: "+Collections.min(ll));
	      System.out.println("Max: "+Collections.max(ll));
	 }
}
