package ArrayPgms;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValuesAppearingNTimes {
	public static void main(String[] args) {
		int[] arr = {1,2,2,4,4,2,3,3,6,6};
		int repeatCount =3 ;  			// if this is 2 means - print the values appearing two times in array
		System.out.println("The given array is " + Arrays.toString(arr));
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) +1);	}
			else {
				map.put(arr[i], 1);
			}	
		}
		System.out.println(map);
		Set<Integer> set = map.keySet();
		
		System.out.println("Below are the values appearing " + repeatCount + " times in array ..");
		for(Integer i: set) {
			if(map.get(i)== repeatCount)
			System.out.println(i);
		}
		
	}
}
