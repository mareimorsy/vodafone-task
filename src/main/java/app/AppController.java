package app;

import org.springframework.web.bind.annotation.RestController;

import helpers.TextFileReader;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class AppController {

    @RequestMapping(produces = MediaType.APPLICATION_XML_VALUE, // Content-Type: text/xml
        value = "/", // The main entry point
        method = RequestMethod.GET) // Request type
    @ResponseBody
    public String index() { // The thinnest controller ever !
    	// Read the text file and return its XML Content as a string
        return TextFileReader.readFile("file.txt");
    }
    
}
