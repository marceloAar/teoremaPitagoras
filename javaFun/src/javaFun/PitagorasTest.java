//Marcelo Aceituno R
//Full Stack JAVA 0034
package javaFun;

public class PitagorasTest {

	public static void main(String[] args) {
		
		Pitagoras hi = new Pitagoras();		
		
		int cat1 = 5;
		int cat2 = 3;
				
		System.out.println("La Hipotenusa del Triangulo de Catetos " +cat1+ " y " +cat2+ " es: " +hi.calcularHipotenusa(cat1, cat2));
		
	}

}
