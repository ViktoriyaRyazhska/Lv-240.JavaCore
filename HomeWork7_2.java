package HW7_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("First","Peter");
		map.put("Cheba","Sofi");
		map.put("Slim","Orest");
		map.put("Gumi","Ira");
		map.put("Tran","Andy");
		map.put("Kipit","Vasya");
		map.put("Cat","Orest");
		map.put("Dog","Orest");
		map.put("Pretty","Ivan");
		map.put("Cheba","Peter");
		
		//Output the entities of the map on the screen. 

//		for (Map.Entry<String,String> m:map.entrySet())
//		{System.out.println("First_Name: "+m.getValue()+"  Last_Name: "+m.getKey());}
		
		//There are at less two persons with the same firstName among these 10 people?
        Set<String> set= new HashSet<String>();
		for (Iterator<Entry<String, String>> i=map.entrySet().iterator();i.hasNext();)
		{
			Map.Entry<String,String> m=(Entry<String, String>)i.next();
			if (!set.add(m.getValue()))
				{System.out.println("Duplicate first name: "+m.getValue());}
		}
		
		//Remove from the map person whose firstName is ”Orest” (or other). Print result.
		
		while (map.containsValue("Orest"))
		{map.values().remove("Orest");}

		for (Map.Entry<String,String> m:map.entrySet())
   			{System.out.println("First_Name: "+m.getValue()+"  Last_Name: "+m.getKey());}
   			
		
	}

}
