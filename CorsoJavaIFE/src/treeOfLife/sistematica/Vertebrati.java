package treeOfLife.sistematica;

import treeOfLife.interfacce.Locomozione;

public abstract class Vertebrati extends Animale implements Locomozione{
	private String taxon = "Subphylum";
	private String name = "Vertebrata";
	private String taxonomy = taxon +": "+ name;
	
	/**
	 * @return the taxon and name
	 */

	public String getTaxonomy() {
		return taxonomy +" - "+ super.getTaxonomy();
	}
}
