
	public static boolean palindrome(String input) {
		if (input.length() <= 1) {
			return true;
		}else {
			if(input.charAt(0)== input.charAt(input.length() - 1)) {
				return palindrome(input.substring(1,input.length()-1));
			}else {
				return false;
			}
			
		}
	}
	
	
	public static boolean palindrome(String input1,int indexA,int indexB) {
		if(indexB <= indexA)  //No esta terminado
			return true;        //
		                      //
		try {
			input1 = br.readLine();
			all_substrings(input1);
			
			input1 = br.readLine();
			input1 = input1.replace(" ", "");
			bw.write("\nResultado1: " + palindrome(input1));
			bw.write("\nResultado2: " + palindrome(input1,indexA + 1,indexB+1));
			bw.flush();
		}catch (Exception ex) {
			
		}
	}
