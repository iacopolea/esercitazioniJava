package treeOfLife;

abstract interface Locomozione {
	
	public String nome_interfaccia = "movimento";
	
	abstract String muovi (double tempo);
}
