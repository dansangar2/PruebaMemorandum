package Pruebas;

import java.util.Arrays;
import java.util.stream.Stream;

public class CalculoExtra {
	
	
	public Integer sumaDigito2(Integer numero) {
		
		Integer resultado = 0;
		
		//El bucle suma todos los digitos desde 1 hasta N.
		for (int i = 1; i <= numero; i++) {
			//obtenerSuma obtiene la suma de los dígitos ejemplo: 9 => 9, 15 => 1 + 5 = 6.
			resultado += obtenerSuma(i);
		}
		return resultado;
	}
	
	//Función recursiva.
	private Integer obtenerSuma(Integer dato) {
		//Cuando es 0 significa que ya no hay nada que sumar, y por ende, el bucle acaba.
		if(dato == 0) {
			return dato;
		}
		//De forma recursiva suma los valores de los dígitos del número.
		//El módulo obtiene el último valor, y la división remueve el último valor.
		//Dejando así uno menos a la suma
		return dato%10 + obtenerSuma(dato/10);
	}
	
	
	//Para este ejercicio, no he tenido en consideración que el String "0" se considere como 0.
	//No lo aclara en el enunciado.
	public Object[] moverCeros2(Object[] objetos) {
			
		Integer tam = objetos.length;
		Integer ceros = tam - 1;
		Integer index = 0;
		Object[] resultado = new Object[tam];
		
		
		for (Object obj : objetos) {
            if (obj instanceof Integer && (Integer) obj == 0) {
            	System.out.println(ceros);
            	resultado[ceros] = 0;
                ceros--;
            } else {
            	System.out.println(index);
            	resultado[index] = obj;
            	index++;
            }
        }
		
		return resultado;
	}
}
