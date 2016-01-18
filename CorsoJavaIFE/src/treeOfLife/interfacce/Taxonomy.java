package treeOfLife.interfacce;

public interface Taxonomy {
	

	String getName();
	String getTaxon();
	/**
	 * @return the taxonomy name and complete taxonomy
	 */
	default String getSystematic(){
		return getTaxon()+": "+getName();
	};
}
