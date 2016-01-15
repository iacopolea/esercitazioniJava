package treeOfLife;

public abstract class Condroitti extends Vertebrati {
	private String taxon = "Classe";
	private String name = "Chondrichthyes";
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
}
