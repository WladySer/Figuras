package epn;

public class Circulo extends FiguraGeometrica {
	private Punto centro;
	private int radio;
	public Circulo(Punto cent, int rad) {
		
		centro=cent;
		radio=rad;
	}
	public Punto getCentro(	) {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	@Override
	public double calculoArea() {
		double area = Math.PI*Math.pow(radio,2);
		return area;
	}
	@Override
	public double perimetro() {
		double perim = 2*Math.PI*radio;
		return perim;
	}
	@Override
	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}
	@Override
	public Boolean Validacion() {
		if(radio>0){
			System.out.print("Es un circulo");
			return true;
		}
		else{
			System.out.print("No es circulo el radio debe ser mayor a cero");
			return false;
		}
		
	}
	
	
	
}
