package treeOfLife;
import treeOfLife.sistematica.Uccelli;

public class Aquila extends Uccelli implements Locomozione {
	private String taxon = "Genere";
	private String name = "Aquila";
	private String taxonomy = taxon +": "+ name;
	
	/**
	 * @return the taxonomy name and complete taxonomy
	 */
	public String getName() {
		return name;
	}
	public String getTaxon() {
		return taxonomy;
	}
	public String getTaxonomy() {
		return taxonomy +" - "+ super.getTaxonomy();
	}	
	


	
	public String muovi(double t) {
		
		double v = 18; // velocità in Km/h
		double deltaS = v * t;
		String msg = "Hai volato per " + deltaS + " Km";
		return msg;
	}

}
