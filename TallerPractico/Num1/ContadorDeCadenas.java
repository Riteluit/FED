import java.io.*;


public class ContadorDeCadenas {
    
    public static void main(String[] args) {

 BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
 BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));



int c=0;
int b=1;
int v = 0;
String a;

try{
    a=br.readLine();                                //Read the word 
for (int i=0;i< a.length();i++){                    //Get the value of a character
          for (int j=1;j<a.length();j++){         
              if (a.charAt(i)== (a.charAt(j))){     //This compares all the characters with the previously taken
                  b++;                              //This is a counter that increases in one when you find that the characters are the same
              }
          }
          if(b>c){
              c=b; //This takes the amount that is repeated a character
              v= i; //This takes the most repeated character
          }
         b=0;   //The variable takes the value of zero to restart the counter
    }
        bw.write(a.charAt(v)+" : "+c+" \n");  //Print the character that most repeats with the number of times
   bw.flush(); 
}

catch (Exception ex){
    
}
    }
}
