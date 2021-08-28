package arreglos;

public class Ejemplo_Arreglo2Dimensiones {

	public static void main(String[] args) {
		//Declaración e inicialización arreglo una dimensión
		int[] intArray = new int[] {1,2,3,4,5};

		int arr[][] = {{2,7,9},{3,6,1},{7,4,2,0}};
		
		System.out.println("imprime un valor puntual de la matriz"+arr[1][2]);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
