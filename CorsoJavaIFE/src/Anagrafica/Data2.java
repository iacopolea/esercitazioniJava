package Anagrafica;

public class Data2 {
	public void stampaSecondoMetodo ( int giorno, int mese, int anno){

		String controlloGiorno = null;
		String controlloMese = null;
		String controlloAnno = null;
		
		if ((giorno<1)||(giorno>31)){		//verifico che il giorno sia corretto
			controlloGiorno = "il giorno inserito non è corretto";
		} 
		if ((mese<1)||(mese>13)){				// verifico che mese sia corretto
			controlloMese = "il mese inserito non è corretto";
		} 
		if ((anno<1900)||(anno>2015)){		// verifico che l'anno sia corretto
			controlloAnno = "l'anno deve essere compreso tra 1901 e 2015";
		} 
		
		if (controlloGiorno!=null || controlloMese!=null || controlloAnno!=null){
			if (controlloGiorno!=null) System.out.println(controlloGiorno);
			if (controlloMese!=null) System.out.println(controlloMese);
			if (controlloAnno!=null) System.out.println(controlloAnno);
		} else {
			System.out.println("la data inserita è: "+giorno+"/"+mese+"/"+anno);
		}
	}
}
