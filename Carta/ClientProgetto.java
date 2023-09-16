package progettoJava.carta;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//import javax.swing.JOptionPane;

public class ClientProgetto {

	public static void main(String[] args) throws IOException{
		String serverAddress = "localhost";
		int serverPort = 9090;
		Socket s = new Socket(serverAddress, serverPort);
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		Scanner scanner = new Scanner(System.in);
		int scelta;
		do {
			scelta=input.read();
			if(scelta == 1) {
				nuovaPartita();
			}
		}while(scelta != 0);
		input.close();
		out.close();
		s.close();
		scanner.close();
		System.exit(0);
	}

	private static void nuovaPartita() {
		
		
	}
}
