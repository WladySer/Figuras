package epn;

public class Linea {
	private Punto a,b;

	public Linea(Punto a, Punto b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}
	public double longitud(){
		double d1 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		return d1;
	}

	@Override
	public String toString() {
		return "Linea [a=" + a + ", b=" + b + "]";
	}
	
}
