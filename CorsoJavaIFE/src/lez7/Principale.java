package lez7;

class Principale {

	public static void main(String[] args) {
		Punto punto1 = new Punto();
		punto1.x= 2;
		punto1.y= 6;
		
		Punto punto2 = new Punto();
		punto2.x= 0;
		punto2.y= 1;
		
		
		System.out.println("la coordinata x di punto1 vale: "+punto1.x);
		System.out.println("la coordinata y di punto1 vale: "+punto1.y);
		System.out.println("la coordinata x di punto2 vale: "+punto2.x);
		System.out.println("la coordinata y di punto2 vale: "+punto2.y);
		
		
		Aritmetica cheTiPare= new Aritmetica();
		
		//int s= cheTiPare.somma(3, 4);
		
		Punto punto3= new Punto();
		
		int x3= cheTiPare.somma(punto1.x, punto2.x);
		int y3= cheTiPare.somma(punto1.y, punto2.y);
		
		punto3.x = x3;
		punto3.y = y3;
		
		System.out.println("la coordinata x di punto1 vale: "+x3);
		System.out.println("la coordinata y di punto1 vale: "+y3);
	}

}


