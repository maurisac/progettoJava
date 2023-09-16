package progettoJava.carta;

public class Giocatore {

	int pv;
	Mano miaMano = new Mano();
	int punteggio;
	int partiteGiocate;
	int password;
	int username;
	
	public int sottraiPv(int quantità)  //0 ancora vivo, 1 ha perso.
	{	
		this.pv -= quantità;
		if(this.pv > 0) {
			System.out.println("Giocatore: " + this.username + " ha " + this.pv + " PV !!");
			return 0;
		}
		else {
			System.out.println("Giocatore: " + this.username + " raggiunge 0 PV e perde lo scontro !!");
			return 1;
		}
	}
	
	public void increasePunteggio()
	{
		this.punteggio += 10;
		System.out.println("Giocatore: " + this.username + " guadagna 10 punti !! \n " + "Punteggio: " + this.punteggio);
	}

	public void decreasePunteggio()
	{
		this.punteggio -= 5;
		System.out.println("Giocatore: " + this.username + " perde 5 punti !! \n " + "Punteggio: " + this.punteggio);
	}
	
	public void increasePartiteGiocate() {
		this.partiteGiocate ++;
	}
	
}
