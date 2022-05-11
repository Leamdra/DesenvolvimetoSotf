package br.edu.up;

import br.edu.up.model.Cachorro;

public class Programa {

	public static void main (String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.raca = "Rottweiler";
		cachorro1.nome = "Eros";
		cachorro1.idade = 3;
		cachorro1.porte = "medio";
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.raca = "vira lata";
		cachorro2.nome = "suzi";
		cachorro2.idade = 3;
		cachorro2.porte = "pequeno";
		
		Cachorro cachorro3 = new Cachorro(); 
		cachorro3.raca = "vira lata";
		cachorro3.nome = "goa";
		cachorro3.idade = 2;
		cachorro3.porte = "medio";
	}
}
