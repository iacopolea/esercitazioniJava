package lez15Array;

import userInteractions.InOut;

public class DueArray {

	public static void main(String[] args) {
		
		InOut input = new InOut(); // classe con vari metodi per salvare numeri inseriti da console
		int[] aNum = new int[10];
		int maggiori = 0;
		
		for (int i=0;i<10;i++) { // popolo l'array con i numeri
			
			System.out.println("( "+(i+1)+"di 10) - Scrivi un numero intero: ");
			int k = input.catchInt();
			aNum[i] = k;
			
			if (k>5) maggiori++; //conto quali sono maggiori di 5
		}
		int lArray = maggiori-1;
		int[] aSubArray = new int[(maggiori)]; //creo l'array di dimensione pari al tot dei numeri maggiori di 5
		int j = 0;
		
		for (int i=0; i<10; i++) {
			
			if (aNum[i] > 5) {
				aSubArray[j] = aNum[i];
				j++;
			}
		}
		
		for (int i=0; i<=lArray; i++){
			System.out.print(aSubArray[(lArray-i)]);
		}
	}
}