package programa;

import java.util.Iterator;

public class ExString {

	public static void main(String[] args) {
		
		//tipo primitivos 
		int numero = 100;
		
		
		//classe -> variavel é um objeto.
		String texto = "Não sei, so sei que foi assim (Chicó)";
		int comprimento = texto.length();
		
		System.out.println("comprimento: " + comprimento);
		
		String subTexto = texto.substring(0, 27);
		System.out.println("Sub: " +subTexto);
		
		char caractere = texto.charAt(16);
		System.out.println("Char: " + caractere);
		
		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
		
		String[] palavras = texto.split(" ");
		for (String palavra : palavras){
			System.out.println(palavra);
		}
		
		String textoHifen = texto.replace(" ", "-");
		System.out.println(textoHifen);
		
		String textoTab = texto.replace(" ", " ");
		System.out.println(textoTab);
		String[] palavrasTab = textoTab.split("\t");
		for (String palavra : palavrasTab) {
			System.out.println(palavra);
		}
	}
}
