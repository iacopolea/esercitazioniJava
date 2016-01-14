package treeOfLife;

public class Tigre extends Animale implements Locomozione {
	
	String nome = "pippo";
	
	public void muovi (double t) {
		double v = 15; //velocità della tigre in km/h;
		double deltaS = v * t;
		System.out.println("Hai corso per " + deltaS + " Km");
	}	

}