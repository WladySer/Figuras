package epn;

public class Cuadrilatero extends FiguraGeometrica{
	private Punto a,b,c,d;

	public Cuadrilatero(Punto a, Punto b, Punto c, Punto d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public Cuadrilatero() {
		super();
		this.a = new Punto(0,0);
		this.a = new Punto(0,1);
		this.a = new Punto(1,1);
		this.a = new Punto(1,0);
	
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

	public Punto getD() {
		return d;
	}

	public void setD(Punto d) {
		this.d = d;
	}
	
	@Override
	public double calculoArea() {
		double d1 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double d2 = Math.sqrt(Math.pow((c.getX()-b.getX()), 2)+Math.pow((c.getY()-b.getY()), 2));
		double area = d1*d2;
		return area;
	}
	@Override
	public double perimetro() {
		double d1 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double d2 = Math.sqrt(Math.pow((c.getX()-b.getX()), 2)+Math.pow((c.getY()-b.getY()), 2));
		double perim = 2*(d1+d2);
		return perim;
	}

	@Override
	public String toString() {
		return "Cuadrilatero [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	@Override
	public Boolean Validacion() {

		double d1 = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
		double d2 = Math.sqrt(Math.pow((c.getX()-b.getX()), 2)+Math.pow((c.getY()-b.getY()), 2));
		double d3 = Math.sqrt(Math.pow((d.getX()-c.getX()), 2)+Math.pow((d.getY()-c.getY()), 2));
		double d4 = Math.sqrt(Math.pow((a.getX()-d.getX()), 2)+Math.pow((a.getY()-d.getY()), 2));
		double pend1,pend2,pend3,pend4;
		double aux1=(b.getX()-a.getX());
		double aux2=(c.getX()-b.getX());
		double aux3=(d.getX()-c.getX());
		double aux4=(a.getX()-d.getX());
		if(aux1==0)
			pend1=0;
		else
			pend1=((b.getY()-a.getY())/(b.getX()-a.getX()));
		if(aux2==0)
			pend2=0;
		else
			pend2=((c.getY()-b.getY())/(c.getX()-b.getX()));
		if(aux3==0)
			pend3=0;
		else	
			pend3=((d.getY()-c.getY())/(d.getX()-c.getX()));
		if(aux4==0)
			pend4=0;
		else
			pend4=((a.getY()-d.getY())/(a.getX()-d.getX()));
				
		
		if(d1==d3 && d2==d4 && pend1==pend3 && pend2==pend4){
			if(d1==d2 && d3==d4){
				System.out.println("La figura es un cuadrado");
			}
			else{
				System.out.println("La figura es un rectangulo");
			}
			return true;
		}
		else{
			System.out.println("La figura es un cuadrilatero de otro tipo");
			
		return false;
		}

		
	}
	
	

}
