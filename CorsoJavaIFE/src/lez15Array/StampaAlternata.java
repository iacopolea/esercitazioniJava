package lez15Array;

public class StampaAlternata {

	public static void main(String[] args) {
		
		int[] aNum = {1,2,3,4,5,6,7,8,9,10,11};
		int l = aNum.length;
		int m = l/2;
			for (int i=0; i<m; i++ ) {
				int pos = l-i;
				System.out.println("posizione" + (i+1) + ": " + aNum[i]);
				System.out.println("posizione" + pos + ": " + aNum[pos-1]);
			}
			if (l%2 != 0) System.out.println("posizione" + (m+1) + ": " + aNum[m]);
	}

}
