package ejerciciosPropuestos227;

import java.util.Arrays;

public class Arreglos {

	//EJERCICIO 2
	
		//REALIZA UN PROGRAMA QUE CREE DOS VECTORES DE 100 ELEMENTOS. 
		//EL PRIMERO ALMACENARÁ UNA SERIE DE DATOS NUMÉRICOS DESORDENADOS.
		//DICHOS DATOS SERÁN DATOS GENERADOS ALEATORIAMENTE.
		//EL SEGUNDO ARRAY CONTRNDRÁ LOS MISMOS DATOS PERO ORDENADOS POR EL MÉTODO INSERTION SORT
	
    public static int[] generateVector(int numberOfElements) {
        int[] vector = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            vector[i] = (int) ((Math.random() * (numberOfElements - 1)) + 1);
        }
        return vector;
    }

    public static int[] insertionSort(int[] vectorRandom) {
        int[] vector = Arrays.copyOf(vectorRandom, vectorRandom.length);
        int numberOfElements = vector.length;
        for (int j = 1; j < numberOfElements; j++) {
            int item = vector[j];
            int previous = j -1;
            while ((previous > -1) && (vector[previous] > item)) {
                vector[previous + 1] = vector[previous];
                previous--;
            }
            vector[previous + 1] = item;
        }
        return vector;
    }

    public static void main(String[] args) {
        int[] vectorRandom = generateVector(100);
        int[] vectorSort = insertionSort(vectorRandom);
        System.out.println(Arrays.toString(vectorRandom));
        System.out.println(Arrays.toString(vectorSort));
    }
}

