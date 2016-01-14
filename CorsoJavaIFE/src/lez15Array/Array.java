package lez15Array;

public class Array {

	int x[] = new int[10]; {
	x[0] = 10;
	x[1] = 20;
	}
	int[] v = {4,6,3,1};
	public static int sommaValoriArray (int[]v){
		int somma = 0;
		for (int i=0; i<v.length; i++)
			somma +=v[i];
		
		return somma;
		
	}
}