package progettoJava.carta;

import java.util.Scanner;

public class Carta {

	String nome;
	int atk;
	
	public String getName() 
	{
		return this.nome;
	}
	
	public int getAtk() 
	{
		return this.atk;		
	}
	
	public Carta generateCarta() {
		Carta nuovaCarta = new Carta();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual è il nome della carta: ");
		nuovaCarta.nome = scanner.nextLine();
		System.out.println("Quanto vale il suo attacco: ");
		nuovaCarta.atk = scanner.nextInt();
		scanner.close();
		return nuovaCarta;
	}
	
	public void stampaCarta() {
		System.out.println("Nome: " + this.getName());
		System.out.println("Valore di attacco: " + this.getAtk());

	}
}

