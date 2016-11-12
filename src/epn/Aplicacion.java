package epn;

public class Aplicacion {

	public static void main(String[] args) {
		Punto p1 = new Punto(2,3);
		Punto p2 = new Punto(2,9);
		Punto p3 = new Punto(7,9);
		Punto p4 = new Punto(7,3);
		
		Linea linea = new Linea(p1,p2);
		Circulo cir = new Circulo(p1,10);
		Triangulo tri = new Triangulo(p1,p2,p3);
		Cuadrilatero cuad = new Cuadrilatero(p1,p2,p3,p4);
		
		
		
		
		System.out.println("Punto = " + p1);
		System.out.println(linea+" de longitud = "+linea.longitud()+"\n");
		System.out.println(cir);
		if(cir.Validacion()){
			System.out.println("El area del circulo es = "+cir.calculoArea());
			System.out.println("El perimetro del circulo es = "+cir.perimetro()+"\n");
		}
		System.out.println(tri);
		if(tri.Validacion()){
			System.out.println("El area del triangulo es = "+tri.calculoArea());
			System.out.println("El perimetro del triangulo es = "+tri.perimetro()+"\n");
		}
		System.out.println(cuad);
		if(cuad.Validacion()){
			System.out.println("El area del cuadrado es = "+cuad.calculoArea());
			System.out.println("El perimetro del cuadrado es = "+cuad.perimetro());
		}

	}

}
