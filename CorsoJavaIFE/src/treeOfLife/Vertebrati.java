package treeOfLife;

import treeOfLife.sistematica.Animale;

public abstract class Vertebrati extends Animale implements Locomozione{
	private String taxon = "Subphylum";
	private String name = "Vertebrata";
	private String taxonomy = taxon +": "+ name;
	
	/**
	 * @return the taxon and name
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
}
