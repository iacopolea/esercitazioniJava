package treeOfLife.sistematica;

import treeOfLife.Vertebrati;

public abstract class Uccelli extends Vertebrati{
	private String taxon = "Classe";
	private String name = "Aves";
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

}
