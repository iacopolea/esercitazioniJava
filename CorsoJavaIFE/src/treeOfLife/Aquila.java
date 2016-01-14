package treeOfLife;

public class Aquila extends Animale implements Locomozione {
	String nome = "aquila";
	@Override
	public void muovi(double t) {
		
		double v = 18; // velocità in Km/h
		double deltaS = v * t;
		System.out.println("Hai volato per " + deltaS + " Km");
	}

}
