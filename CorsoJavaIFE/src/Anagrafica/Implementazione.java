package Anagrafica;

class Implementazione {
	
	public static void main(String[] args) {
		
		Anagrafica persona1 = new Anagrafica();
		Data2 data1 = new Data2();
		// inserire Nome, Cognome, età in anni, altezza in centimetri, genere (m/f)
		persona1.stampa ("nome", "Pallavicini", 30, 156, 'f');
		// inserire una data gg, mm, aaaa
		data1.stampaSecondoMetodo (51,1,4012);
	}
}
