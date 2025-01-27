package Pruebas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class Calculo {

	public String calcularIMC(Integer peso, Integer altura) {
		//Calculamos la masa, siendo peso/altura^2
		Double imc = peso/Math.pow(altura, 2);
		
		//Devolvemos el resultado según el valor de la masa.
		//Como se asume que si no pasa por el primer if, el 2o debe estar
		//por encima de 18.5, por lo que no es necesario en los ifelse comprobar
		//si es mayor al valor que tiene por encima.
		if(imc<=18.5) {
			return "Infrapeso";
		} else if(imc <= 25.0) {
			return "Normal";
		} else if (imc <= 30) {
			return "Sobrepeso";
		} else {
			return "Obeso";
		}
	}
	
	public Integer sumaDigito(Integer numero) {
		
		Integer resultado = 0;
		
		//El bucle suma todos los digitos desde 1 hasta N.
		for (int i = 1; i <= numero; i++) {
			//obtenerSuma obtiene la suma de los dígitos con los valores de N > 9.
			resultado += obtenerSuma(i);
		}
		return resultado;
	}
	
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
	public Object[] moverCeros(Object[] objetos) {
		
		//Indica cuantos 0s hay en el array.
		Long ceros = Arrays.stream(objetos)
                .filter(e -> e instanceof Integer && (Integer) e == 0)
                .count();
		
		//Obtiene el array filtrando los que no son 0.
		Object[] sinCeros = Arrays.stream(objetos)
                .filter(e -> !(e instanceof Integer && (Integer) e == 0))
                .toArray();
		
		//Une un nuevo array con un numero de 0 igual al Long 0 con el array sin 0s.
		Object[] resultado = Stream.concat(
                Arrays.stream(sinCeros), 
                Stream.generate(() -> 0).limit(ceros)
        ).toArray();

        return resultado;
	}
	
	
}
