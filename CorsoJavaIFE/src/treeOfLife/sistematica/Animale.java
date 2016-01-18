package treeOfLife.sistematica;

public abstract class Animale {
	private String name = "Animalia";
	private String taxon = "Regno";
	private String taxonomy = taxon +": "+ name;
	
	/**
	 * @return the taxon and name
	 */

	public String getTaxonomy(){
		return taxonomy;
	}
}
