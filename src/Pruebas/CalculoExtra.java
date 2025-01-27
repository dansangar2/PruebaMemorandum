package Pruebas;

import java.util.Arrays;
import java.util.stream.Stream;

public class CalculoExtra {
	
	
	public Integer sumaDigito2(Integer numero) {
		
		Integer resultado = 0;
		
		//El bucle suma todos los digitos desde 1 hasta N.
		for (int i = 1; i <= numero; i++) {
			//obtenerSuma obtiene la suma de los d�gitos ejemplo: 9 => 9, 15 => 1 + 5 = 6.
			resultado += obtenerSuma(i);
		}
		return resultado;
	}
	
	//Funci�n recursiva.
	private Integer obtenerSuma(Integer dato) {
		//Cuando es 0 significa que ya no hay nada que sumar, y por ende, el bucle acaba.
		if(dato == 0) {
			return dato;
		}
		//De forma recursiva suma los valores de los d�gitos del n�mero.
		//El m�dulo obtiene el �ltimo valor, y la divisi�n remueve el �ltimo valor.
		//Dejando as� uno menos a la suma
		return dato%10 + obtenerSuma(dato/10);
	}
}
