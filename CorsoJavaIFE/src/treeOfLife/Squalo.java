package treeOfLife;

public class Squalo extends Animale implements Locomozione {
	String nome = "squalo";
	public void muovi (double t) {
		double v = 18; // velocità in nodi
		double deltaS = v * t;
		System.out.println("Hai nuotato per " + deltaS + " Miglia");
	}	
}
