package test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class BasicHashMap {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Arun"); map.put(2, "ram"); map.put(3, "Kumar M"); map.put(4, "Kumar M");
		System.out.println(map);
		//map.remove(2);
		System.out.println(map);
		System.out.println(map.get(1));
		Set<Integer> setOfKeys = map.keySet();
		
		Iterator itr = setOfKeys.iterator();
		while(itr.hasNext()) {
			Object key = itr.next();
			System.out.println("Key -> " + key + " Value-> " + map.get(key));
		}

	}

}
