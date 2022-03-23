
public class Programa {
	
	public static double somar(double a, double b) {
		double soma = a + b;
		return soma;
		
		// void quer dizer que nao retorna nada dentro da função
		// void nao retorna nada mas recebe um parametro (imprimi a informaçao)
		// public static double é um metodo para retornar uma função 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int valor1 = 100;
		//int valor2 = 60;
		//int resultado = valor1 + valor2;
		//System.out.println(valor);
		double valor1 = 60;
		double valor2 = 50;
		//double resultado = valor1 + valor2;
		double resultado = somar(valor1 = valor2); 
		//System.out.println(valor);
		
		
		//String texto = String.valueOf(resultado);
		//imprimir(texto);
		
	
	}
	
	public static void imprimir(String txt) {
		System.out.println(txt);
	}

}
