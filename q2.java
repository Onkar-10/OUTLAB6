// Importing HashMap class
import java.util.HashMap;
import java.io.* ;
import java.io.FileWriter;
import java.util.*;
public class q2
{
    public static void main(String[] args)
    {
        char c;
        int g,freq,exist_1;
        int exist_2=0;      //so that an extra line is not printed at the end/start of output.txt
        //HashMap<Character, Integer> countmap = new HashMap<Character, Integer>(26);
        try{
            // Open the file that is the first 
            // command line parameter
            FileInputStream fstream = new FileInputStream(args[0]);
            FileWriter outputwriter = new FileWriter("output.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                
            if(!strLine.isEmpty()){

                if(exist_2!=0)
                outputwriter.write("\n");
                exist_2=1;

                exist_1=0 ; //this is there so that lines like  "*&67667  56$" are taken care of(i.e strings with no alphabets)
                HashMap<Character, Integer> countmap = new HashMap<Character, Integer>(26);

                for(int i=0;i<strLine.length();i++){
                    c=strLine.charAt(i);
                    if(c>=97&&c<=122){
                        exist_1=1;
                        if(countmap.containsKey(c)){
                            countmap.put(c,countmap.get(c)+1);
                        }
                        else
                        countmap.put(c,1);
                    }
                    else if(c>=65&&c<=90){
                        exist_1=1;
                        c=(char)(c+32);
                        if(countmap.containsKey(c)){
                            countmap.put(c,countmap.get(c)+1);
                        }
                        else
                        countmap.put(c,1);
                    }
                }
                if(exist_1==1){
                int max_val = Collections.max(countmap.values());

                g=0;
                for(char j='a';j<='z';j++){
                    if(countmap.containsKey(j)){
                        freq=countmap.get(j);
                        if(freq==max_val){
                            if(g==0)
                            outputwriter.write(j+"="+freq);
                            else
                            outputwriter.write(","+j+"="+freq);
                            g++ ;
                        }
                    }
                }
              
            }
            //outputwriter.write("\n");
            //System.out.println ();     //take care no extra ine printed at end
            }
            
            }
            //Close the input stream
            in.close();
            outputwriter.close();
              }
              catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
            }
    }   
}
