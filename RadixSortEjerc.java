package meli.ejerc;

import java.util.ArrayList;
import java.util.HashMap;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		// Paso 1 - Convierto de int[] a String []
		String arrSt[] = StringUtil.toStringArray(arr);

		// Paso 2 - Misma cantidad de elementos
		StringUtil.lNormalize(arrSt,'0');

		HashMap<Integer, ArrayList<String>> lista = new HashMap<>();

		// Paso 3 - generar 10 listas vacias (inicialmente)

		int cantidadDig = arrSt[0].length();
		for (int i=0; i<cantidadDig; i++){
			inicializaLista(lista);
			int posicionDig = cantidadDig-1-i;
			for(int x=0; x<arrSt.length; x++){
				/*El método de charat devuelve el carácter
				en el índice definido. En este método,
				el valor del índice debe estar entre 0 y
				la longitud de la cadena menos 1.*/

				int m = arrSt[x].charAt(posicionDig)-'0';
				lista.get(m).add(arrSt[x]);
			}
			rearmarArray(arrSt,lista)
		}

	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}

	}
}
