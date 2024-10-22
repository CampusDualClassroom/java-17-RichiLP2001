package com.campusdual.classroom;

public class Exercise17 {

	//crea un array de enteros con el
	// tamaño especificado por el parametro.
	public static int[] createEmptyIntArray(int positions) {
		return new int[positions];
	}

	//crear un array de 3 elementos tipo String y los inicializa
	// con valores númericos como cadena
	public static String[] createInitializedStringArray() {
		return new String[]{"1", "2", "3"/*, "4"*/};
	}

	//ASIGNA el VALOR "value" al índice "index" del array
	public static void populateArray(int[] array, int index, int value) {
		array[index] = value;
	}

	//devuelve el TAMAÑO del array
	public static int arrayLength(int[] array) {
		return array.length;
	}

	//MUESTRA el VALOR en el INDICE "index" del array
	public static void showValue(int[] array, int index) {
		System.out.println("Valor en el indice "+index+": "+array[index]);
	}

	public static void main(String[] args) {
		//1. CREAR un array de ENTEROS vacío de position 4
		   // (es decir: el tamaño de la lista va de *-->4 posiciones=0,1,2,3)
		int[] intArray = createEmptyIntArray(5);

		//2. CREAR un array de STRINGs incicializado
        String[] stringArray = createInitializedStringArray();

		//3. Poner el valor 10 en la posición 0 del array de enteros
		populateArray(intArray, 0, 10);
		// Poner el valor 9 en la posicion 1
		populateArray(intArray, 1, 9);
		// Poner el valor 9 en la posicion 2
		populateArray(intArray, 2, 8);
		populateArray(intArray, 3, 7);
		populateArray(intArray, 4, 6);

		//4. MOSTRAR el VALOR de la posicion 2->1->0

		//showValue(intArray, 3);
		showValue(intArray, 2);
		showValue(intArray, 1);
		showValue(intArray, 0);
		showValue(intArray, 4);

		//5. MOSTRAR  el TAMAÑO del array de enteros
		System.out.println("Tamaño del array: "+arrayLength(intArray));
	}
}
