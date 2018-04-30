package iengine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //check args: <method> <filename>
        if(args.length < 2) {
            System.out.println("Usage: iengine <method> <filename>.");
            System.exit(1);
        }

        String method = args[0];
        String fileName = args[1];

        /* read problem TELL and ASK */
        try {
            String problem[] = readProblemFile(fileName);

            // Call the main engine
            InferEngine iEngine = new InferEngine(problem[0],problem[1],method);



            // print test
            System.out.println(problem[0]);
            System.out.println(problem[1]);





        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    /** read a problem file
     * @param fileName
     *  @return two dimensions array of string tell and ask
     */

    private static String[] readProblemFile(String fileName) throws IOException {
        //create file reading objects
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);

        String result[] = new String[2];
        String line;
        boolean isTelling = true; // read until see the word ASK, then swap
        while ( (line = reader.readLine())!= null ){
            if ( line.equalsIgnoreCase("TELL")){
                result[0] = ""; // init
                line = reader.readLine();   // read next line;
            }else if ( line.equalsIgnoreCase("ASK")){
                isTelling = false;
                result[1] = ""; // init
                line = reader.readLine();   // read next line
            }

            if ( isTelling ){
                result[0] += line;
            }else{
                result[1] += line;
            }

        }

        reader.close();
        fileReader.close();

        return result;
    } // end read file


} //class
