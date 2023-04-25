package test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Test1_temp {
	public static void main(String[] args) {
		String str = "this is a very very very costly gift gift costly. Yes this is  "; 
		str = str.replace(".", "");  //replace any full stop , Grammar 
		String[] words = str.split(" ");
		Map<String,Integer> map = new HashMap<String, Integer>();
				
		for(int i=0; i<words.length; i++) {
			if(map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i])+1);
			}
			else {
				map.put(words[i], 1);
			}	
			}
		System.out.println(map);
		Set k = map.keySet();
		Iterator itr	= k.iterator();
		
		while (itr.hasNext()) {
			Object key = itr.next();
			if(map.get(key)==3) 
			System.out.println(key);
		}
		
		}
		
	}
