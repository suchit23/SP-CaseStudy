package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.BufferedReader;
import java.net.InetAddress;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

@RestController
public class SampleResource {

    @RequestMapping("/")
    public String hello() throws Exception {

            String parseLine; 
			String strHello = "<center><font face=verdana><h1>Hello and welcome to Suchit's CI/CD Pipeline Demo! ----- Version 16.0</h1>";
            String strDia = "<br><img src=/spdevops.jpg><br>";
            String strDoc = "<h2><a href=http://blog.suchit23.in/devops-cicd-using-jenkins-maven-docker-sonar-selenium-kubernetes/> Step by Step Guide to implement this project</h2></center></font><br>";
            StringBuffer sbrBuildSystem = new StringBuffer();
            InetAddress inetAddress = InetAddress.getLocalHost();
            DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("IST"));
            Date date = new Date();
            sbrBuildSystem.append("<h2> IP Address where this was built: " + inetAddress.getHostAddress() + "<br> Hostname where this was built: " + inetAddress.getHostName() + "<br> Time when this was built: " + sdf.format(date) + "<br>");

        	String strReturn = strHello + sbrBuildSystem + strDia;
        	return strReturn;

    }

}
