package lez11Cicli;

public class NumeriPrimi {
	public static void main (String args[]){
		
		String messaggio = "2";
		
		for (int i=3; i<=1000; i++) {
			
			int divisori = 0;
			
			for (int j=2; j<i; j++){
				
				int resto = i%j;
								
				if (resto==0){
					divisori = divisori + j;
				}
								
			}
			if (divisori == 0) messaggio = messaggio + " - " + i;
		}
		System.out.println(messaggio);
	}
}
