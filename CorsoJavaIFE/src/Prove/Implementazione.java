package Prove;

class Implementazione {

	public static void main(String[] args) {
		// Prima istanza della classe Numeri
		Numeri numeri1;
		numeri1 = new Numeri();
		numeri1.numeroX=2;
		numeri1.numeroY=3;
		
		//Seconda istanza della classe Numeri
		Numeri numeri2;
		numeri2 = new Numeri();
		numeri2.numeroX = 5;
		numeri2.numeroY = 6;
		
		//Mostriamo a video i valori numeroX e numeroY dalle due istanze
		System.out.println(numeri1.numeroX);
		System.out.println(numeri1.numeroY);
		System.out.println(numeri2.numeroX);
		System.out.println(numeri2.numeroY);
	}

}
