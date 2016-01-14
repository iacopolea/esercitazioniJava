package lez15Array;

public class TreUguali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aNum = {1,2,3,4,4,2,7,8,8,10};
		int l = aNum.length;
		for (int i=0; i<(l-2); i++ ) {
			if (aNum[i] == aNum[i+1]){
				if (aNum[i+1] == aNum[i+2]) {
					System.out.println("Tre valori consecutivi uguali");
				}
			}
					
		}
	}

}
