
public class Item extends GameObject {
	
	//public int id;
	
	Item(int id){
		super(id);
		//this.id = id;
	}
	
	@Override
	public void render() {
		System.out.println("Calling " + getId() +"'s Render Method");
		
	}

	@Override
	public void update() {
		System.out.println("Calling " + getId() +"'s Update Method");
		
	}

}
