package progettoJava.carta;

public class Mazzo extends Carta {
	Pila mazzo = new Pila();
	
	public void inserimentoCarta() {
		mazzo.push(mazzo);
		}
	
	public Carta rimozioneCarta() {
		return mazzo.pop();
	}
	
}
