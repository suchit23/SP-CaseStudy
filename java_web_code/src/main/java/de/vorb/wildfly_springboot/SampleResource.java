package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

@RestController
public class SampleResource {

    @RequestMapping("/")
    public String hello() {

            String parseLine; /* variable definition *//* create objects */            
            StringBuffer sbrDoc = new StringBuffer();
            String strHello = "<h1>Hello and welcome to Suchit's CI/CD Pipeline Demo! ----- Version 4.0</h1><br><h2>Below are the system details where this program was built to know which environment was this built on:</h2>";
            StringBuffer sbrBuildSystem = new StringBuffer();
            
            Map<String, String> env = System.getenv();
        	for (String envName : env.keySet()) {
            sbrBuildSystem.append(System.out.format("%s=%s%n",envName,env.get(envName)));
        	}
            
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

        	String strReturn = strHello + sbrBuildSystem + sbrDoc;
        	return strReturn;

    }

}
