package lez12stringhe;

public class Stringhe {	
	
	
		public static void main(String[] args) {
				
			String arrayTesto[] = new String[10]; {				
				arrayTesto[0] ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras bibendum ornare massa, nec blandit neque auctor id.";
				arrayTesto[1] = "Donec venenatis sed dui in pharetra. Curabitur tempor mi ex, eu pharetra nunc hendrerit iaculis.";
				arrayTesto[2] = "Vivamus ac erat nec arcu ultricies congue eget id ligula.";
				arrayTesto[3] = "Cras rhoncus lacus ac lorem sodales aliquet.";
				arrayTesto[4] = "Vivamus et ex eget urna porttitor finibus. Donec scelerisque elit quis accumsan malesuada. Vestibulum mauris augue, imperdiet vitae pulvinar sed, molestie et ipsum.";
				arrayTesto[5] = "Praesent congue nisl eu diam lobortis,";
				arrayTesto[6] = "sed tincidunt lorem lacinia.";
				arrayTesto[7] = "Vestibulum rutrum suscipit nisl eget egestas. Curabitur bibendum dolor sed risus tincidunt tincidunt. Cras eleifend aliquam orci, et consectetur turpis facilisis quis. Nam in fermentum quam, non rhoncus dui.";
				arrayTesto[8] = "Sed et lacus nisi.";
				arrayTesto[9] = "Nulla sit amet eros faucibus dui rhoncus dictum quis nec erat. Nulla a felis rhoncus risus laoreet pretium.";
				}
			
		/*l1 = s1.length();
		l2 = s2.length();
		l3 = s3.length();
		l4 = s4.length();
		l5 = s5.length();
		l6 = s6.length();
		l7 = s7.length();
		l8 = s8.length();
		l9 = s9.length();
		l10 = s10.length();
		*/
		int arrayLunghezze[] = new int[10];
		
		String output="";
		for (int i=0; i<10; i++){

			output = output + arrayTesto[i];
		}
		System.out.println(output);
		
	}

}
