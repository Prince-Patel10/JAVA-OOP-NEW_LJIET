import java.io.*;
import java.util.Scanner;

class Q10 {

    public static void main(String[] args) throws IOException{

      if (args.length < 1) {
            System.out.println("file name provide in command line");
        }

        String filename = args[0];
        int wordcount = 0;

        
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            System.out.println("Words in the file:");
            while (sc.hasNext()) {
                sc.next();
                wordcount++;
            }
            System.out.println(wordcount);
            sc.close();
        } 
    }