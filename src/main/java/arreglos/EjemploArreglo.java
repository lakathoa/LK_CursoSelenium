package arreglos;

public class EjemploArreglo {

	public static void main(String[] args) {
		//Ambas son declaraciones v�lidas
		int intArray[];
		int[] intArray2;
		
		//Declarar un Array de Strings
		String[] arr;
		//Asignar memoria para 5 enteros
		arr = new String[5];
		
		//Inicializa el primer elemento del Array
		arr[0]="cero";
		
		//Inicializa el segundo elemento del Array
		arr[1]="uno";
		
		arr[2]="dos";
		arr[3]="tres";
		arr[4]="cuatro";
		
		System.out.println("Elemento en el �ndice 2: "+arr[1]);

		for(int i=0; i<arr.length;i++) {
			System.out.println("El elemento en el �ndice " +i+" es: "+arr[i]);
		}
	}

}
