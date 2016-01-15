package treeOfLife;

import userInteractions.InOut;

public class Main {
	public static void main(String[] args) {
		InOut IO = new InOut(); // vari metodi per Input e Output
				
		IO.print("Che animale sei?");
		IO.print("1. Squalo");
		IO.print("2. Tigre");
		IO.print("3. Aquila");
		
		int choice = IO.catchInt();
		Vertebrati player;
		if (choice == 1) {
			player = new Selaci();
			IO.print("Per quante ore vuoi nuotare?");
		}else if (choice == 2) {
			player = new Tigre();
			IO.print("Per quante ore vuoi correre?");
		}else {
			player = new Aquila();
			IO.print("Per quante ore vuoi volare?");	
		}	
		
		double t = IO.catchDoub(); // leggo la variabile tempo 
		
		IO.print("Tassonomia >>> " + outputTassonomia(player));
		IO.print(outputLocomozione(player, t));
		
	}

	private static String outputTassonomia (Vertebrati player) {
		
		String taxonomy = player.getTaxonomy();
		
		return taxonomy;
	
	}
	
	private static String outputLocomozione (Locomozione player, double t) {
		String s = player.muovi(t); // chiamo il metodo muovi SPECIFICO della classe che ho creato;
		return s;
	
	}
}





