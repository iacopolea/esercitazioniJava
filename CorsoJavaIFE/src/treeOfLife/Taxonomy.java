package treeOfLife;

interface Taxonomy {
	String name = "Animalia";
	String taxon = "Regno";
	
	/**
	 * @return the taxonomy name and complete taxonomy
	 */
	default String getName() {
		return name;
	}
	default String getTaxon() {
		return taxon;
	}
	default String getTaxonomy(){

		return getTaxon()+": "+getName();
		
	};
}
