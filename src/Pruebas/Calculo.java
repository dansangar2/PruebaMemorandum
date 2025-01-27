package Pruebas;

import java.util.Arrays;
import java.util.stream.Stream;

public class Calculo {

	public String calcularIMC(Integer peso, Integer altura) {
		//Calculamos la masa, siendo peso/altura^2
		Double imc = peso/Math.pow(altura, 2);

		//Devolvemos el resultado seg�n el valor de la masa.
		//Como se asume que si no pasa por el primer if, el 2o debe estar
		//por encima de 18.5, por lo que no es necesario en los ifelse comprobar
		//si es mayor al valor que tiene por encima. Lo mismo para los dem�s.
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
		//Valor guardar� la divisi�n de i, para calcular la suma de los n�meros de mas de 1 d�gito
		int valor = 0;
		//Suma obtendr� el valor de la suma de los d�gitos de un n�mero > 9
		int suma;
		
		//El bucle suma todos los digitos desde 1 hasta N.
		for (int i = 1; i <= numero; i++) {
			
			valor = i;
			suma = 0;
			//Mientras valor/10 no sea 0, significa que sigue habiendo d�gitos que sumar.
			while(valor!=0) {
				//Suma el siguiente d�gito del n�mero
				suma += valor%10;
				//Elimina el �ltimo d�gito para sumar el siguiente
				valor = valor/10;
			}
			
			//Suma el resultado.
			resultado += suma;
			
		}
		return resultado;
	}
	
	//Para este ejercicio, no he tenido en consideraci�n que el String "0" se considere como 0.
	//No se aclara en el enunciado.
	public Object[] moverCeros(Object[] objetos) {
		
		//Indica cuantos 0s hay en el array.
		Long ceros = Arrays.stream(objetos)
                .filter(e -> e instanceof Integer && (Integer) e == 0)
                .count();
		
		//Obtiene el array filtrando los que no son 0s.
		Object[] sinCeros = Arrays.stream(objetos)
                .filter(e -> !(e instanceof Integer && (Integer) e == 0))
                .toArray();
		
		//Une un nuevo array con un n�mero de 0 igual al Long 0 con el array sin 0s.
		Object[] resultado = Stream.concat(
                Arrays.stream(sinCeros), 
                Stream.generate(() -> 0).limit(ceros)
        ).toArray();

        return resultado;
	}
	
	
}
