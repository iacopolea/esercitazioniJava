package Anagrafica;

class Anagrafica {
	
	public void stampa ( String nome,String cognome,int età,int altezza, char genere){
		
		if (genere == 'm'){
			System.out.println("Il cliente si chiama "+nome+" "+cognome);
			System.out.println("ha "+età+" anni ed è alto "+altezza+" centimetri.");
		} else if (genere == 'f') {
			System.out.println("La cliente si chiama "+nome+" "+cognome);
			System.out.println("ha "+età+" anni ed è alta "+altezza+" centimetri.");
		} else
			System.out.println("inserire m se maschio oppure f se femmina");
	}
}
