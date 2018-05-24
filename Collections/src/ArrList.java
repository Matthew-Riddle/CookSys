import java.util.List;
import java.util.ArrayList;

/*An arrayList allows us to have dynamic arrays in java. 
	 * Or in other words, an array that can change size at run time.
	 * In this example I added items to an Inventory in a for loop,
	 * then iterated over that array calling each items render and update methods*/

public class ArrList {
	ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	
	public void createInventory() {
		for(int i = 0; i < 20; i++) {
			Item item = new Item( i );
			objects.add(item);
		}
	}
	
	public void run() {
		createInventory();
		
		for (GameObject gameObject : objects) {
			System.out.println("Item " + gameObject.getId());
			gameObject.render();
			gameObject.update();
		}
		
	}
	
	public static void main(String args[]) {
		ArrList program = new ArrList();
		
		program.run();
	}
}
