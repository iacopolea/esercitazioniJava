package treeOfLife;

public class Selaci extends Condroitti implements Locomozione {
	private String taxon = "Superordine";
	private String name = "Selachimorpha";
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
		double v = 18; // velocità in nodi
		double deltaS = v * t;
		String msg = ("Hai nuotato per " + deltaS + " Miglia");
		return msg;
	}	
}
