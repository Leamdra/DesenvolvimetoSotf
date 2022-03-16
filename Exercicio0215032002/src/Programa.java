
public class Programa { //Inicio 
	
	public static void main (String[ ]args ) {
		
		String[]matriculas = new String [5];
		matriculas[0] ="12345";
		matriculas[1] ="23456";
		matriculas[2] ="34567";
		matriculas[3] ="45678";
		matriculas[4] ="56789";
		
		
		String[]nomes = new String [5];
		nomes[0] ="Ana Maria";
		nomes[1] ="Thales Dohr";
		nomes[2] ="Matheus Barreto";
		nomes[3] ="Edileno Inatomi";
		nomes[4] ="Acir Junior";
		
		double[]notas1 = new double [5];
		notas1[0] = 8.5;
		notas1[1] = 10;
		notas1[2] = 7.7;	
		notas1[3] = 2.5;
	    notas1[4] = 3.5;		
				
	    
		double[]notas2 = new double [5];
		notas2[0] = 5.7;
		notas2[1] = 0.1;
		notas2[2] = 7.7;	
		notas2[3] = 5.2;
	    notas2[4] = 5.3;		
				
	    
	    double[]Notafinal = new double [5];
	    Notafinal[0] = (notas1[0] + notas2[0])/2; 
	    Notafinal[1] = (notas1[1] + notas2[1])/2; 
	    Notafinal[2] = (notas1[2] + notas2[2])/2; 
	    Notafinal[3] = (notas1[3] + notas2[3])/2; 
	    Notafinal[4] = (notas1[4] + notas2[4])/2; 
	    
	   //
				
		System.out.println("Matriculas: " + matriculas [0]);
		System.out.println("Nome: " + nomes [0]);
		
		if (Notafinal[0] >= 6) {
			
			System.out.println("Aprovado: (x)Sim ( )Não");
			System.out.println("Nota Final: " + Notafinal[0]); 
		} else {

			System.out.println("Aprovado: ( )Sim (x)Não");
			System.out.println("Nota Final: " + Notafinal[0]); 
		}
	 
		
		
		//
		
		System.out.println("Matriculas: " + matriculas [1]);
		System.out.println("Nome: " + nomes [1]);
		
		if (Notafinal[1] >= 6) {
			
			System.out.println("Aprovado: (x)Sim ( )Não");
			System.out.println("Nota Final: " + Notafinal[1]); 
			
		} else {
			System.out.println("Aprovado: ( )Sim (x)Não");
			System.out.println("Nota Final: " + Notafinal [1]); 
		}
		
		
//
		
		System.out.println("Matriculas: " + matriculas [2]);
		System.out.println("Nome: " + nomes [2]);
		
		if (Notafinal[1] >= 6) {
			
			System.out.println("Aprovado: (x)Sim ( )Não");
			System.out.println("Nota Final: " + Notafinal[2]); 
			
		} else {
			System.out.println("Aprovado: ( )Sim (x)Não");
			System.out.println("Nota Final: " + Notafinal [2]); 
		}
		
		
//
		
		System.out.println("Matriculas: " + matriculas [3]);
		System.out.println("Nome: " + nomes [3]);
		
		if (Notafinal[1] >= 6) {
			
			System.out.println("Aprovado: (x)Sim ( )Não");
			System.out.println("Nota Final: " + Notafinal[3]); 
			
		} else {
			System.out.println("Aprovado: ( )Sim (x)Não");
			System.out.println("Nota Final: " + Notafinal [3]); 
		}
		
//
		
		System.out.println("Matriculas: " + matriculas [4]);
		System.out.println("Nome: " + nomes [4]);
		
		if (Notafinal[1] >= 6) {
			
			System.out.println("Aprovado: (x)Sim ( )Não");
			System.out.println("Nota Final: " + Notafinal[4]); 
			
		} else {
			System.out.println("Aprovado: ( )Sim (x)Não");
			System.out.println("Nota Final: " + Notafinal [4]); 
		}
	}
	

}//Fim
