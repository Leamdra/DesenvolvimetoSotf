import java.util.Scanner;

public class programa {

	
		public static void main(String[] args ) {
			
			Scanner leitor = new Scanner(System.in);
			
			String[] nomes = new String[3];
			
			for (int i = 0; i < 2 ; i++) {
				System.out.println("Digite o nome:");
				nomes[i] = leitor.nextLine();
			}
			
			System.out.println("nome: ");
		
		}
}
