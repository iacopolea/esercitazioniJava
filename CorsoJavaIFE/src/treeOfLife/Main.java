package treeOfLife;

import userInteractions.InOut;

public class Main extends Animale {

	public static void main(String[] args) {
		
		InOut IO = new InOut(); // vari metodi per Input e Output
		Locomozione player; // il player implementa interfaccia Locomozione (metodo muovi)
		
		IO.print("Che animale sei?");
		IO.print("1. Squalo");
		IO.print("2. Tigre");
		IO.print("3. Aquila");
		
		int choice = IO.catchInt();	
		if (choice == 1) {
			player = new Squalo();
			IO.print("Per quante ore vuoi nuotare?");
		}else if (choice == 2) {
			player = new Tigre();
			IO.print("Per quante ore vuoi correre?");
		}else {
			player = new Aquila();
			IO.print("Per quante ore vuoi volare?");			
		}
		
		double t = IO.catchDoub(); // leggo la variabile tempo
		player.muovi(t); // chiamo il metodo muovi SPECIFICO della classe che ho creato;
		String x = player.nome;
		IO.print(x);
	}

}