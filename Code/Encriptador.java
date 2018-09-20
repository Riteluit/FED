import java.io.*;
 
public class Encriptador {
 
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        String texto,cod;
        int codigo;
        char opcion;
        //Put the text
        try{
        do {
            bw.write("Introduce un texto: ");
            bw.flush();
            texto = br.readLine().replace(" ", "x");
        } while (texto.isEmpty());
        //Put the value for displacement
        do {
            bw.write("Introduce el codigo: ");
            bw.flush();
            cod = br.readLine();
            codigo = Integer.parseInt(cod);
            
        } while (codigo < 1);
        //Enter the operation to: Encrypt or Decrypt

        do {
            bw.write("(C) cifrar o (D) descifrar: ");
            br.readLine();
            bw.flush();
            opcion = (char) System.in.read();
        } while (Character.toUpperCase(opcion) != 'C' && Character.toUpperCase(opcion) != 'D');
        if (Character.toUpperCase(opcion) == 'C') {
            bw.write("Texto cifrado: " + cifradoCesar(texto, codigo));
            bw.flush();
        } else {
            bw.write("Texto descifrado: " + descifradoCesar(texto, codigo));
            bw.flush();
        }
    }catch (Exception ex){
    }
    }
 
    //Encrypt the text 
    public static String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString().toLowerCase().replace("a", "4").replace("e","3").replace("i","1").replace("o","0").replace("u","9")+"\n";
    }
 
    //Decrypt the text
    public static String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        String texto1 = texto.toLowerCase().replace("4", "a").replace("3","e").replace("1","i").replace("0","o").replace("9","u");
        for (int i = 0; i < texto1.length(); i++) {
            if (texto1.charAt(i) >= 'a' && texto1.charAt(i) <= 'z') {
                if ((texto1.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto1.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto1.charAt(i) - codigo));
                }
            } else if (texto1.charAt(i) >= 'A' && texto1.charAt(i) <= 'Z') {
                if ((texto1.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto1.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto1.charAt(i) - codigo));
                }
            }
        }
    return cifrado.toString().replace("x"," ")+"\n";
    }
}
