//Marcelo Aceituno R
//Full Stack JAVA 0034
package javaFun;

public class Pitagoras {	

	 public double calcularHipotenusa(int catetoA, int catetoB) {			
			
			double hipot = 0;
		 
			hipot = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
			
			return hipot;
	
	 }
}
