package com.refer.json;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*;
public class JSONFileReadInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONParser p=new JSONParser();
		
		//Object object;
		try {
			Object object = p.parse(new FileReader("jsonfile.json"));
			JSONObject jsonobject=(JSONObject) object;
			String firstname=(String) jsonobject.get("firstName");
			String lastname=(String) jsonobject.get("lastName");
			long age=(long) jsonobject.get("age");
			System.out.println("firstname:"+firstname);
			System.out.println("lastname:"+lastname);
			System.out.println("age:"+age);
			Map address= (Map) jsonobject.get("address");
			Iterator<Map> itr=address.entrySet().iterator();
			System.out.println("Address");
			while(itr.hasNext())
			{
				Map.Entry key=(Entry) itr.next();
				System.out.println(key.getKey()+":"+key.getValue());
		 	}
			JSONArray aobject= (JSONArray) jsonobject.get("phoneNumbers");
			Iterator i= aobject.iterator();
			while(i.hasNext())
			{
			Iterator<Map> itr1 = ((Map) i.next()).entrySet().iterator();
				
				while(itr1.hasNext())
					{

					Map.Entry k=(Entry) itr1.next();
					
				System.out.println(k.getKey()+":"+k.getValue());
			}
			
			}
		}
		 catch(IOException e){
			 e.printStackTrace();
		 }
		catch (ParseException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		

}
