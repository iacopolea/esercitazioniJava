package lez17Incapsulamento;

import userInteractions.InOut;

public class Bancomat {

	static ContoBancario MioConto = new ContoBancario();
	static InOut MyInput = new InOut();
	
	public static void main(String[] args) {
		
		System.out.println("digitare il numero corrispondente alla funzione desiderata");
		System.out.println("1. Saldo");
		System.out.println("2. Prelievo");
		int numFnz = MyInput.catchInt();
		
		if (numFnz == 1) {		// saldo						
				if (verificaPIN()){		// qui verifico il pin
					System.out.println("Il suo saldo è: " + MioConto.getSaldo() + " Euro");
				} 	
		} else if (numFnz == 2) {		// prelievo
			System.out.println("Inserire l'importo desiderato");
			int n = MyInput.catchInt();
			if (n>0 && n<=MioConto.getSaldo()) {
				if (verificaPIN()) {
					MioConto.setSaldo(MioConto.getSaldo() - n);		// imposto il nuovo saldo
					System.out.println("Erogazione dell'importo desiderato: "+n+" Euro");
					System.out.println("Il suo nuovo saldo è: " + MioConto.getSaldo() + " Euro");
				}
			}
			else if (n<=0) System.out.println("L'importo non è erogabile");
			else System.out.println("Il saldo non è sufficiente");
		} else System.out.println("Tentativo Errato");
	}
	
	
	private static boolean verificaPIN(){		// metodo per verificare il pin
		boolean verifica = false;
		System.out.println("Inserire il codice PIN");
		int n = MyInput.catchInt();
		
		if (n==MioConto.getCodicePIN()){
			verifica = true;
		} else System.out.println("Tentativo Errato");
		return verifica;
	}
	
}