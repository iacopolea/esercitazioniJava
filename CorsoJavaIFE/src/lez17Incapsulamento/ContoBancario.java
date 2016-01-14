package lez17Incapsulamento;
import userInteractions.InOut;

public class ContoBancario {
	
	// variabili d'istanza
	private double saldo;
	private int codicePIN;
	private String nome;
	
	// Setter e Getter
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getCodicePIN() {
		return codicePIN;
	}
	public void setCodicePIN(int codicePIN) {
		this.codicePIN = codicePIN;
	}
	
	
	// costruttore nuovo utente
	public ContoBancario(){ 
		InOut myInput = new InOut();
		System.out.println("Digitare il proprio Nome");
		String s = myInput.catchString();
		nome = s;
		saldo = 0;
		System.out.println("Digitare un codice PIN di 5 cifre");
		int n = myInput.catchInt();
		codicePIN = n;
	}
	
	//costruttore con utente già esistente
	public ContoBancario(String nome){
		this.nome = nome;
		if (nome.equals("Iacopo Leardini")) {
			codicePIN = 12345;
			saldo = 3000;
		} else if (nome.equals("Giovanni")) {
			codicePIN = 67890;
			saldo = 30;
		} else if (nome.equals("Gianmaria Generoso")) {
			codicePIN = 01101;
			saldo = 90000000;
		}
	}
}