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
	
	
	//Para este ejercicio, no he tenido en consideraci�n que el String "0" se considere como 0.
	//No se aclara en el enunciado.
	public Object[] moverCeros2(Object[] objetos) {
			
		Integer tam = objetos.length;
		//�ndice final para poner los 0s
		Integer ceros = tam - 1;
		//�ndice inicial para poner los valores por orden (excluyendo 0s)
		Integer index = 0;
		Object[] resultado = new Object[tam];
		
		//Bucle para recorrer los datos
		for (Object obj : objetos) {
            if (obj instanceof Integer && (Integer) obj == 0) {
            	//El 0 se agrega al final.
            	resultado[ceros] = 0;
                ceros--;
            } else {
            	//Se agrega el elemento y se suma 1 al �ndice.
            	resultado[index] = obj;
            	index++;
            }
        }
		
		return resultado;
	}
}
