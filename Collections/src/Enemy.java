/*Class created but never used.*/
public class Enemy extends GameObject{

	int x, y;
	
	int id;
	
	Enemy(int x, int y, int id){
		super(id);
		this.x = x;
		this.y = y;

	}

	@Override
	public void render() {
		
		System.out.println("Enemy " + id + " Render method called");
		
	}

	@Override
	public void update() {
		
		System.out.println("Enemy " + id + " Update method called");
		
	}
	
}
