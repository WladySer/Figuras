package epn;

public class Triangulo extends FiguraGeometrica{
	private Punto a,b,c;

	public Triangulo(Punto a, Punto b, Punto c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
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

	public Punto getC() {
		return c;
	}

	public void setC(Punto c) {
		this.c = c;
	}

	@Override
	public double calculoArea() {
		double d1 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double d2 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double d3 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double semiPerim = (d1+d2+d3)/2;
		double area = Math.sqrt(semiPerim*(semiPerim-d1)*(semiPerim-d2)*(semiPerim-d3));
		return area;
	}

	@Override
	public double perimetro() {
		double d1 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double d2 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double d3 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double perim = d1+d2+d3;
		return perim;
	}
	
	@Override
	public String toString() {
		return "Triangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	@Override
	public Boolean Validacion() {
		double d1 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double d2 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double d3 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		if(d1==d2 && d2==d3){
			System.out.println("El triangulo es equilatero");
		}
		else if(d1==d2 || d2==d3 || d3==d1){
			System.out.println("El triangulo es isoseles");
		}
		else{
			System.out.println("El triangulo es escaleno");
		}
		return true;
	}

	
	

}
