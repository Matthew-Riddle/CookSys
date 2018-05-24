import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEx {

	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	ArrayList<String> list = new ArrayList<String>();
	
	public void run() {
		//Add all items to list
		list.add("Cow");
		list.add("Chicken");
		list.add("Pizza");
		list.add("Car Keys");
		list.add("watch");
		
		//Iterate through the list and add each item to the map using the index as the key
		int i = 0;
		for(String string : list) {
			map.put(i, string);
			i++;
		}
		
		//Iterate through the list again and display everything that is in the hashmap
		i = 0;
		for(String string : list) {
			System.out.println(i + " " + map.get(i));
			i++;
		}
		
		map.remove(3);
		map.remove(2);
		
		System.out.println("");
		
		i = 0;
		for(String string : list) {
			System.out.println(i + " " + map.get(i));
			i++;
		}
		
		System.out.println();
		System.out.println(map);
		
	}
	
	public static void main(String args[]) {
		HashMapEx hm = new HashMapEx();
		
		hm.run();
	}
	
}

