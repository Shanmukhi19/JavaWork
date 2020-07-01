package com.refer.json;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.json.simple.JSONObject;
public class WriteJSON {

	public static void main(String[] args) { 
		List<JSONObject> employee=new ArrayList<JSONObject>();
		JSONObject obj=new JSONObject();    
		  obj.put("name","sonoo");    
		  obj.put("age",27);    
		  obj.put("salary",70000);   
		  JSONObject obj1=new JSONObject();    
		  obj1.put("name","shannu");    
		  obj1.put("age",27);    
		  obj1.put("salary",60000);  
		  employee.add(obj);
		  employee.add(obj1);
		  JSONObject obj2=new JSONObject();    
		  obj2.put("name","vignan");    
		  obj2.put("age",25);    
		  obj2.put("salary",80000);  
		  employee.add(obj2);
		  //System.out.println(empolyee);
		  System.out.println("employee details:");
		  Iterator<JSONObject> i=employee.iterator();
		   while(i.hasNext()) {
			   System.out.println(i.next());
		   }
		    
	}

}
