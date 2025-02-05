package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.BufferedReader;
import java.net.InetAddress;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class SampleResource {

    @RequestMapping("/")
    public String hello() throws Exception {

			String strHello = "<center><font face=verdana><h1>Hello and welcome to Suchit's CI/CD Pipeline Demo! ----- Version 16.0</h1>";
            String strDia = "<br><img src=/spdevops.jpg><br>";
            String strDoc = "<h2><a href=http://blog.suchit23.in/devops-cicd-using-jenkins-maven-docker-sonar-selenium-kubernetes/> Step by Step Guide to implement this project</h2></center></font><br>";
            StringBuffer sbrBuildSystem = new StringBuffer();
            StringBuffer sbrDate = new StringBuffer();
            InetAddress inetAddress = InetAddress.getLocalHost();
            
            try{
                String parseLine; 
                URL url= new URL("http://dev.suchit23.in/date.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                while ((parseLine = br.readLine()) != null) {
                System.out.println(parseLine);
                sbrDate.append(parseLine);
                }
                br.close();
            } 
            catch (MalformedURLException me){System.out.println(me);}
            catch (IOException ioe){System.out.println(ioe);}

            sbrBuildSystem.append("<h2> IP Address where this was built: " + inetAddress.getHostAddress() + "<br> Hostname where this was built: " + inetAddress.getHostName() + "<br> Time when this CI/CI was started: " + sbrDate + "<br></h2>");
            
            String strReturn = strHello + sbrBuildSystem + strDia;
        	return strReturn;

    }

}
