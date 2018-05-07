package helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
* This class is a simple wrapper around file libraries
* It has a simple method that reads a text file
*
* @author  Marei Morsy
* @version 1.0
* @since   2018-05-7 
*/
public class TextFileReader {
	
	/**
	* This method is used to read a text file from a specific path.
	*
	* @param filePath This is the file path (relative/absolute).
	* @return String This returns the whole text file as a String.
	*/
    public static String readFile(String filePath) {
    	String line, fullText = "";
    	
        try{
        	
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null){
            	fullText += line + "\r\n";
            }
            
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
        return fullText;
    }

}