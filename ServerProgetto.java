package progettoJava.carta;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;


public class ServerProgetto {

	public static void main(String[] args) throws IOException {
		ServerSocket listener = new ServerSocket(9090);
		System.out.println("Server is running");
		Socket socket1 = listener.accept();
		PrintWriter out1 = new PrintWriter(socket1.getOutputStream(), true);
		//BufferedReader input1 = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
		String messaggio="INSERIRE USERNAME";
		String scelta = JOptionPane.showInputDialog(null, messaggio);
		messaggio="INSERIRE PASSWORD";
		scelta = JOptionPane.showInputDialog(null, messaggio);
		while(true) {
			int number;
			do {
				messaggio="\t BENVENUTO NELL'APPLICAZIONE \n\n\t (1)Nuova Partita \n\t (2)Profilo e Classifica \n\t (3)Regolamento \n\t (0)Esci \n";
				scelta = JOptionPane.showInputDialog(null, messaggio);
				number = Integer.valueOf(scelta);
				out1.println(number);
			}while(number <0 || number >3);
			switch(number){
				case 1:{ 
						nuovaPartita();
						break;
				}
				case 2:{
					profiloClassifica();
					break;
				}
				case 3:{
					regolamento();
					break;
				}
				default:{
					out1.println("Errore di scelta menu'. Chiusura Server");
					System.exit(0);
				}
			}
			out1.println(0);
			if(number == 0)break;
		}//finito il while (true)
		listener.close();
	}
	
	private static void nuovaPartita() throws IOException {
		JOptionPane.showInternalMessageDialog(null,"Nuova Partita");
		ServerSocket listener = new ServerSocket(9090);
		Socket socket2 = listener.accept();
		PrintWriter out2 = new PrintWriter(socket2.getOutputStream(), true);
		//BufferedReader input2 = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
		
	}

	private static void profiloClassifica() {
		JOptionPane.showInternalMessageDialog(null,"Profilo o Classifica");
	}

	private static void regolamento() {
		JOptionPane.showInternalMessageDialog(null,"Regolamento");
	}


}