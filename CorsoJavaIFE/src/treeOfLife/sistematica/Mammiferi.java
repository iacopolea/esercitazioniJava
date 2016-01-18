package treeOfLife.sistematica	;

public abstract class Mammiferi extends Vertebrati {
	private String taxon = "Classe";
	private String name = "Mammalia";
	private String taxonomy = taxon +": "+ name;
	
	/**
	 * @return the taxonomy name and complete taxonomy
	 */

	public String getTaxonomy() {
		return taxonomy +" - "+ super.getTaxonomy();
	}
	
	String caratteristica = "I Mammiferi hanno il corpo ricoperto di pelo, se non allo stadio adulto almeno in qualche stadio embrionale";
	
	public void allattamento(int numeroPiccoli){
		
	}
	
}
