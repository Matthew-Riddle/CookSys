import java.util.HashSet;

public class HashSetEx {

	/*A hashset is a data collection that does not preserve
	 * the order in which things are inserted. It does not have a key/value lookup.
	 * There is no indexing.
	 * There are no duplicates allowed. Does not allow primitive values, but will 
	 * accept the wrapper classes for primitives 
	 * */
	
	HashSet<String> classGuys = new HashSet<String>();
	
	String[] people = {"Matthew", "Evan", "Mahdi", "Jason", "Cruz", "Kyle", "Pat", "Aarth"};
	
	void run() {
		
		//Add classmates to hashset
		for (String string : people) {
			classGuys.add(string);
		}
		
		//Display classmates
		for (String string : classGuys) {
			System.out.println(string);
		}
		
		classGuys.remove(people[0]);
		
		classGuys.add(null);
		classGuys.add(null);
		classGuys.add(null);
		
		//Accepts null, but only one.
		
		System.out.println("");
		
		//Display classmates
		for (String string : classGuys) {
			System.out.println(string);
		}
	}
	
	/*Even though they were entered in a certain order, due to the hashing algorithm the names are not
	 * displayed in order.*
	 */
	
	
	
	public static void main(String args[]) {
		HashSetEx hs = new HashSetEx();
		
		hs.run();
	}
}
