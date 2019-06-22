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

            String parseLine; /* variable definition *//* create objects */            URL URL = new URL("http://www.example.com/"); 
            StringBuffer sbrDoc = new StringBuffer();
            BufferedReader br = new BufferedReader(new InputStreamReader(URL.openStream()));

            while ((parseLine = br.readLine()) != null) {
                System.out.println(parseLine);
                sbrDoc.append(parseLine);
            }
            br.close();
            String strBuildSystem = "Hello Suchit's World! ----- Version 44444444";
        	String strReturn = sbrDoc + strBuildSystem;
        	return strReturn;

    }

}
