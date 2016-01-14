package Anagrafica;

public class Data {
	public void stampa ( int giorno, int mese, int anno){
		
		if ((giorno>0)&&(giorno<=31)){
			
			if((mese>0)&&(mese<13)){
				
				if ((anno>1900)&&(anno<=2015)){
										
					System.out.println("la data inserita è: "+giorno+"/"+mese+"/"+anno);
				
				} else { System.out.println("l'anno deve essere compreso tra 1901 e 2015");}
			
			} else {
						if ((anno>1900)&&(anno<=2015)){										
							System.out.println("il mese inserito non è corretto");
						} else {System.out.println("il mese inserito non è corretto e l'anno deve essere compreso tra 1901 e 2015");}
					}
			
		} else {
			
			if((mese>0)&&(mese<13)){
			
				if ((anno>1900)&&(anno<=2015)){
										
					System.out.println("il giorno inserito non è corretto");
				
				} else {System.out.println("il giorno inserito non è corretto e l'anno deve essere compreso tra 1901 e 2015");}
		
			} else {
			
					if ((anno>1900)&&(anno<=2015)){
					
						System.out.println("il giorno inserito non è corretto e il mese inserito non è corretto");
		
					} else {System.out.println("il giorno inserito non è corretto e il mese inserito non è corretto e l'anno deve essere compreso tra 1901 e 2015");}
			}
		}
		
	}
}