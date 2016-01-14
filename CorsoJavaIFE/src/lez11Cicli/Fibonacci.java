package lez11Cicli;

public class Fibonacci {

	public static void main(String[] args) {
		
		int penultimo=1;
		int ultimo=1;
		String messaggio="1 - 1";
		while (ultimo<10000) {
			int number = ultimo;
			ultimo = ultimo + penultimo;
			messaggio = messaggio + " - " + ultimo;			
			penultimo = number;
		}
		System.out.print(messaggio);	
	}
}