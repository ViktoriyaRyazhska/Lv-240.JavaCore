package project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListObject {
	
	public List<String> GetSetting(int hash){
	Map<String, List<String>> data = new HashMap<String, List<String>>();
	data.put("car", Arrays.asList("toyota", "bmw", "honda"));
	data.put("fruit", Arrays.asList("apple","banana"));
	data.put("computer", Arrays.asList("acer","asus","ibm"));
	return Arrays.asList("acer","asus","ibm");
	}

}
