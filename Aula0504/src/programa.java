import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class programa {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File ("C:\\Users\\09995133970\\Downloads\\grupos-tabulados\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		
		int grupoA = 0;
		int grupoB = 0;
		int grupoC = 0;
		int grupoD = 0;
		int grupoE = 0;
		int grupoF = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
						
//			System.out.println(linha);
			
			String[] dadosLinha = linha.split("\t");
//			System.out.println("Grupo: " + dadosLinha[0]);
//			System.out.println("Valor: " + dadosLinha[1]);
//			System.out.println("-----------------");
			
			//calcular o total por grupo;
			//calcular o total geral;
			
			if (dadosLinha[0].equals("A")) {
				System.out.println("A");
				}
			if (dadosLinha[0].equals("A")) {
				//System.out.println(dadosLinha[1]);
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoA =  grupoA + valor;
				//System.out.println(grupoA);
			}
			
			if (dadosLinha[0].equals("B")) {
				//System.out.println(dadosLinha[1]);
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoB =  grupoB + valor;
				//System.out.println(grupoA);
			}
			
			if (dadosLinha[0].equals("C")) {
				//System.out.println(dadosLinha[1]);
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoC =  grupoC + valor;
				//System.out.println(grupoA);
			}
			
			if (dadosLinha[0].equals("D")) {
				//System.out.println(dadosLinha[1]);
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoD =  grupoD + valor;
				//System.out.println(grupoA);
			}
			if (dadosLinha[0].equals("E")) {
				//System.out.println(dadosLinha[1]);
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoE =  grupoE + valor;
				//System.out.println(grupoA);
			}
			if (dadosLinha[0].equals("F")) {
				//System.out.println(dadosLinha[1]);
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoF =  grupoF + valor;
				//System.out.println(grupoA);
			}
		}
		System.out.println("Valor total do grupo A: " + grupoA);
		System.out.println("Valor total do grupo B: " + grupoB);
		System.out.println("Valor total do grupo B: " + grupoC);
		System.out.println("Valor total do grupo B: " + grupoD);
		System.out.println("Valor total do grupo B: " + grupoE);
		System.out.println("Valor total do grupo B: " + grupoF);
		
		leitor.close();
	}
}
	
		
			
				
			
				
				
//				grupo[] grupos = new grupo[5];
//				int contator = 0 ;
//				
//				while(leitor.hasNext()) {
//					String linha = leitor.nextLine();
//					String[] dados = linha.split(";");
//					String grupoA = dados [0];
//					String grupoB = dados [1];
//					String grupoC = dados [2];
//					String grupoD = dados [3];
//					String grupoE = dados [4];
//					String grupoF = dados [5];
				

