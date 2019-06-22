package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class SampleResource {

    @RequestMapping("/")
    public String hello() {

            String parseLine; /* variable definition *//* create objects */            
            StringBuffer sbrDoc = new StringBuffer();
            String strBuildSystem = "Hello Suchit's World! ----- Version 44444444";
            
            try{
            URL url = new URL("http://www.example.com/"); 
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((parseLine = br.readLine()) != null) {
                System.out.println(parseLine);
                sbrDoc.append(parseLine);
            	}
            	br.close();
        	}
        	catch (MalformedURLException me){System.out.println(me);}
        	catch (IOException ioe){System.out.println(ioe);}

        	String strReturn = sbrDoc + strBuildSystem;
        	return strReturn;

    }

}
