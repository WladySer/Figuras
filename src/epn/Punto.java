package epn;

public class Punto {
	private int x;
	private int y;
	public Punto(int a, int b) {
		super();
		this.x=a;
		this.y=b;
		
	}
	public Punto() {
		super();
		this.x=0;
		this.y=0;
		
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	};
	

}
