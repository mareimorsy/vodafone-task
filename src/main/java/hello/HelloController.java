package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

@RestController
public class HelloController {

    @RequestMapping(produces = MediaType.APPLICATION_XML_VALUE, 
        value = "/", 
        method = RequestMethod.GET)
    @ResponseBody
    public String index() {

    	String line, response = "";
        try{
            File file = new File("file.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((line = br.readLine()) != null){
              response += line + "\r\n";
            }
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
        return response;
    }
    
}
