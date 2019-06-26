# Suchit's Complete CI/CD Pipeline Demonstration


----------

## Deliverables
This demonstration will simulate a completely automated CI/CD deployment pipeline using Jenkins. It will essentially do the following steps (phases):
 1. Pull the source code for a Java EE based Project from GIT. (SCM AUTOMATION)
 2. Compile (build) the code using Maven to generate the .war file (BUILD AUTOMATION)
 3. Deploy the war file to a local Wildly installation (DEV ENV)
 4. Run Test cases & ensure they pass. (TEST AUTOMATION)
 5. Run SonarQube for static code analysis (TEST AUTOMATION) 
 6. Copy the .war to a Docker build workspace (DEPLOYMENT AUTOMATION)
 7. Build a Docker image for Jboss server to run the war file and push to docker hub. (DEPLOYMENT AUTOMATION)
 8. Pull the Docker image from docker hub and run a test container in a test node (TEST ENV). (DEPLOYMENT AUTOMATION)
 9. Test the docker container using Selenium for specific texts in the web page (TEST AUTOMATION)
 10. Pull the Docker image from docker hub and deploy to a Kubernetes cluster in the cloud (PROD ENV) (DEPLOYMENT AUTOMATION)

![Architecture Diagram](http://www.suchit23.in/spdevops.jpg)

## Environment URLs

Jenkins Access using username **guest** password **guest** :	[http://dev.suchit23.in:8080](http://dev.suchit23.in:8080)
DEV Environment with standalone Wildfly installation :	[http://dev.suchit23.in](http://dev.suchit23.in)

TEST Environment running docker :	[http://test.suchit23.in](http://test.suchit23.in)
SonarQube Server using username **admin** password **admin** :	[http://test.suchit23.in:9000](http://test.suchit23.in:9000)

Nagios Monitoring using username **nagiosadmin** and password **nagiosadmin** :	[http://sandbox.suchit23.in/nagios/](http://sandbox.suchit23.in/nagios/)

PROD Environment running in Kubernetes Cluster :	[http://www.suchit23.in](http://www.suchit23.in)