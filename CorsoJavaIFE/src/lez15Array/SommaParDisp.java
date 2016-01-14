package lez15Array;

public class SommaParDisp {

	public static void main(String[] args) {
		
		int[] aNum = {1,2,3,4,5,6,7,8,9,10};
		int l = aNum.length;
		int sommaPari=0;
		int sommaDispari=0;
		for (int i=0; i<l; i+=2 ) {
			sommaPari = sommaPari + aNum[i];
		}
		for (int i=1; i<l; i+=2 ) {
			sommaDispari = sommaDispari + aNum[i];
		}
		if (sommaPari == sommaDispari) 
			System.out.println("Pari uguale Dispari");
		else
			System.out.println("Pari e Dispari diversi");
	}

}
