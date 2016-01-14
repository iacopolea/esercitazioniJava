package lez15Array;
import userInteractions.InOut;

public class SeqDoppia {

	public static void main(String[] args) {
		
		InOut input = new InOut(); // la classe InOut mi permette di acquisire le parole di una frase al netto di caratteri speciali virgole etc
		
		System.out.println("Scrivi una frase e clicca invio");
		String[] aWrd1 = input.catchWords("\\s+"); //l'espressione regolare passata come parametro splitta per ogni spazio
		
		System.out.println("Scrivi una seconda frase e clicca invio");
		String[] aWrd2 = input.catchWords("\\s+");
		
		scansione: for (int i = 0; i < aWrd1.length; i++) { // label: scansione
			for (int j=0; j<aWrd2.length; j++)
			
				if (aWrd1[i].equals(aWrd2[j])) {
					System.out.println("OK");
					break scansione; // una volta trovata la prima corrispondenza esce
				}
		}
	}

}
