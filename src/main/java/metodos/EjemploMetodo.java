package metodos;

public class EjemploMetodo {

	public static void main(String[] args) {
		int resultado = suma(5,9);
		System.out.println(resultado);
		
		int resultado1 = suma(20,40);
		System.out.println(resultado1);
		
		int resultado2 = suma(8,35);
		System.out.println(resultado2);
		
		String carros = carro(3);
		System.out.println(carros);
	}
	
	public static int suma(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static String carro(int a) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		return cars[a];
	}

}
