package Pruebas;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Objeto de prueba
		Calculo c = new Calculo();
		CalculoExtra ce = new CalculoExtra();
		
		//Prueba del calculo IMC
		System.out.println(c.calcularIMC(50, 500) + "\n");
		
		//Prueba del calculo de digitos
		System.out.println(c.sumaDigito(4));
		System.out.println(c.sumaDigito(10));
		System.out.println(c.sumaDigito(12) + "\n");
		
		//Moviendo 0s
		System.out.println(Arrays.toString(c.moverCeros(new Object[] {false,1,0,1,2,0,1,3,"a"})) + "\n");
		
		
		//Métodos alternativos:
		
		//Prueba del calculo de digitos
		System.out.println(ce.sumaDigito2(4));
		System.out.println(ce.sumaDigito2(10));
		System.out.println(ce.sumaDigito2(12) + "\n");
		
		
				
	}

}
