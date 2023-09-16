package progettoJava.carta;

import java.util.*;

public class Pila extends Carta {
	
	//Creazione Nodo (Contenente carta e puntatore alla prossima carta)
	private class NodoPila {
		Carta carta;
		NodoPila next = new NodoPila();
	}
	
	private NodoPila cima;
	
//inizializza la cima della pila a null, quindi non esistono né "carta" né "next"
	public Pila() {
		cima = null; 
	}

	
//METODI
	public boolean empty() {
		return cima == null;
	}
	
	public void push(Carta carta) {
		NodoPila n = new NodoPila();
		n.carta = carta;
		n.next = cima;
		cima = n;
	}
	
	public Carta pop(){
		if (cima == null)
			throw new EmptyStackException();
		else {
			Carta cartaEstratta = cima.carta;
			cima = cima.next;
			return cartaEstratta;
		}
	}
	
}
