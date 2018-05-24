
public abstract class GameObject {

	private int id;
	
	GameObject(int id) {
		this.id = id;
	}
	
	public abstract void render();
	
	public abstract void update();
	
	public int getId() { return id; }
}
