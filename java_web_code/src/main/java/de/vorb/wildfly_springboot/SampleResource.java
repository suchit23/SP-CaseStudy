package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.net.InetAddress;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

@RestController
public class SampleResource {

    @RequestMapping("/")
    public String hello() throws Exception {

            String parseLine; /* variable definition *//* create objects */
            StringBuffer sbrDia = new StringBuffer();      
            StringBuffer sbrDoc = new StringBuffer();
            String strHello = "<h1>Hello and welcome to Suchit's CI/CD Pipeline Demo! ----- Version 4.0</h1><br>";
            StringBuffer sbrBuildSystem = new StringBuffer();
            InetAddress inetAddress = InetAddress.getLocalHost();
            DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("IST"));
            Date date = new Date();
            sbrBuildSystem.append("<h2> IP Address where this was built: " + inetAddress.getHostAddress() + "<br> Hostname where this was built: " + inetAddress.getHostName() + "<br> Time when this was built: " + sdf.format(date));
            

            
            try{
            URL url1= new URL("https://drive.google.com/file/d/1GNno3JoIn3YmXVSPcVxI4B7Pm2knuip-/view");
            URL url2= new URL("http://blog.suchit23.in/environment-details-access/"); 
            

            BufferedReader br1 = new BufferedReader(new InputStreamReader(url1.openStream()));
            while ((parseLine = br1.readLine()) != null) {
                System.out.println(parseLine);
                sbrDia.append(parseLine);
            	}
            	br1.close();
        	BufferedReader br2 = new BufferedReader(new InputStreamReader(url2.openStream()));
            while ((parseLine = br2.readLine()) != null) {
                System.out.println(parseLine);
                sbrDoc.append(parseLine);
            	}
            	br2.close();
        	}
        	catch (MalformedURLException me){System.out.println(me);}
        	catch (IOException ioe){System.out.println(ioe);}

        	String strReturn = strHello + sbrBuildSystem + sbrDia + sbrDoc;
        	return strReturn;

    }

}
