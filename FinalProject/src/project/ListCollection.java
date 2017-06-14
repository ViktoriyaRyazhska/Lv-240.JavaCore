package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListCollection {
	Map<Integer, List<List<String>>> map;
	
	public ListCollection(String NameFile) throws NumberFormatException, FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(NameFile));
		map = new LinkedHashMap<Integer, List<List<String>>>();
		String s = null;
		String[] sSplit;
		List<String> listA;
		int key = 0;
		while ((s = br.readLine()) != null) {
			sSplit = s.split(";");
			key = Integer.parseInt(sSplit[0]);
			listA= new ArrayList<String>();
			for (String str : sSplit) {
				listA.add(str);
			}
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<List<String>>());
			}
			map.get(key).add(listA) ;
		}
		br.close();
	}

	public List<List<String>> GetCollection(int heshKey){
		return map.get(heshKey);
	}
		
}
