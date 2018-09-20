package TallerTeorico;

import java.io.*;



public class Contador {
	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
	public static int Subtring(String total, String sub) {
		int counter = 0;
		for(int i=0; i < total.length() - sub.length();i++) {
			if (total.substring(i,i+sub.length()).equals(sub)) {
				counter += 1;
			}
		}
		return counter;
	}


	public static void all_substrings(String total) throws IOException {
		int max = Integer.MIN_VALUE;
		String winner = "";
		String temp = "";
		
		for (int i = 2 ; i <= total.length();i++) { //Tamaño de subcadenas
			for (int j=0; j<= total.length() - i;j++) {
				if (Subtring(total,total.substring(j, j+i))>max) {
					max = Subtring(total,total.substring(j, j+i));
					winner = total.substring(j,j+i);
				}
			}
		}
		bw.write("La cadena que mas se repite es "+winner+" y se repite " + max );
		bw.flush();
	}
	
	public static void main (String []args) {
		
		 
		 String input;
		 try {
			 input = br.readLine();
			 all_substrings(input);
			 
				 
		 }catch (Exception ex) {
			 
		 }
	}
}
