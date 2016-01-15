package treeOfLife;

import treeOfLife.sistematica.Mammiferi;

public class Tigre extends Mammiferi implements Locomozione {
	private double v = 15; //velocità della tigre in km/h;

	private String taxon = "Specie";
	private String name = "Panthera tigris";
	private String taxonomy = taxon +": "+ name;

	
	/**
	 * @return the taxonomy name and complete taxonomy
	 */
	public String getName() {
		return name;
	}
	public String getTaxon() {
		return taxon;
	}
	public String getTaxonomy() {
		return taxonomy +" - "+ super.getTaxonomy();
	}

	
	public String muovi (double t) {		
		double deltaS = v * t;
		String msg = "Hai corso per " + deltaS + " Km";
		return msg;
	}	

}