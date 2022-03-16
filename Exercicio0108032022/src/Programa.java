

/**Exercício de fixação 1
▪ Criar um programa para processar as seguintes informações de um aluno:
matrícula, nome , nota1, nota2 e se ele está aprovado ou reprovado;
▪ Durante a execução calcular a nota final do aluno utilizando a seguinte
regra: notaFinal = (nota1 + nota2) / 2. Se a nota final for igual ou superior a
6 o aluno está aprovado, caso contrário estará reprovado;
▪ O programa deverá imprimir o seguinte relatório:
Matrícula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim ( ) Não
Nota final: xxxxx *
*/ 




public class Programa {//Inicio

	public static void main(String []args ) {//Inicio main
	
		String matricula ="99821021";
		String nome = "Leandra Oliveira";
		double nota1 = 7.5;
		double nota2 = 4.1;
		double Notafinal = (nota1 + nota2)/2;
		
		//igual ou superior a 6
		
	
		
		System.out.println("Matricula: " + matricula); //concatenação
		System.out.println("Nome: " + nome);
		
		if (Notafinal >= 6) {
		
			System.out.println("Aprovado: (x)Sim ( )Não");
			System.out.println("Nota Final: " + Notafinal); 
		} else {

			System.out.println("Aprovado: ( )Sim (x)Não");
			System.out.println("Nota Final: " + Notafinal ); 
		}
		
	
	}//Fim main
	
}//Fim
