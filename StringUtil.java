package meli.ejerc;
import java.util.ArrayList;
import java.util.Scanner;

public class StringUtil {
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n) {
		int i;
		String cadena = "";
		String cS = Character.toString(c);
		for(i = 0; i < n; i++) {
			cadena = cadena + cS;
		}
		return cadena;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String cadena = s;
		int i;
		String cS = Character.toString(c);
		int diff = Math.abs(n-s.length());
		for(i=0; i<diff; i++){
			cadena = cS + cadena;
		}
		return cadena;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[]) {
		int i;
		String[] arrS = new String[arr.length];
		for (i = 0; i < arr.length; i++) {
			arrS[i] = Integer.toString(arr[i]);
		}
		return arrS;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int i;
		int[] arrS = new int[arr.length];
		for (i = 0; i < arr.length; i++) {
			arrS[i] = Integer.parseInt(arr[i]);
		}
		return arrS;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxLong=0, i;
		for (i=0; i < arr.length; i++){
			if(maxLong < arr[i].length()){
				maxLong = arr[i].length();
			}
		}
		return maxLong;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int maximo=maxLength(arr);
		int i;
		for(i=0; i<arr.length;i++){
			arr[i]= lpad(arr[i],maximo,c);
		}
	}
}
