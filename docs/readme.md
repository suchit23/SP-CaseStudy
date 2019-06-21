SP-CaseStudy Development Steps 


1. Create 2 instances in GCP to begin with: sp-sandbox and sp-dev
	sp-sandbox will act like the desktop from where coding is done and hence will have the git repository and other utilities
	sp-dev will act as the DEV environment where Jenkins will be installed
2. Install Java and Jenkins in sp-dev
	Install Nginx and set up port 80 to forward to Jenkins port 8080
	<add steps here>
3. Find a good sample java web app code in Github to use for the project
4. Found git repo: https://github.com/saurabh0010/devops_pipeline_demo.git
5. Duplicate this repo to your own repo:
	git clone --bare https://github.com/saurabh0010/devops_pipeline_demo.git
	cd devops_pipeline_demo.git
	Create a new repository in your own account (in this case SP-CaseStudy)
	git push --mirror https://github.com/suchit23/SP-CaseStudy
	cd ..
	rm -rf devops_pipeline_demo.git
	cd SP-CaseStudy
	This is the new repository from which the further changes will be done
	By doing git push the online github will be reflected as well for others to refer 
6. Optional Step: Make your workspace in sp-sandbox available easily via browser to work from different computers and to collaborate:
	Install Apache2 web server by command: sudo apt-get install apache2
	Edit the Apache2 conf file at /etc/apache2/apache2.conf
	Add the following block:
	Alias /sp "/home/suchit23/workspace"
		<Directory "/home/suchit23/workspace">
    		Options Indexes MultiViews
   		AllowOverride None
   		Require all granted
		</Directory>
	In the above code, /sp is the browser URL to access the local holder /home/suchit23/workspace
	Restart Apache2 by command: service apache2 restart 
	You should be able to access your workspace directory via the http URL http://35.244.9.132/sp  where the IP will be different for your case
7. Configure mail utilities in Jenkins instance: sudo apt-get install mailutils 
	Select Internet Site under Postfix configuration
 	click on ok
 	enter your system mail name(Default you can select)
	click on ok
8. Various Jenkins configuration:
	Install git and maven in the system having Jenkins
	Manage Jenkins->Global Tool Config: Add git and Add maven
	Ensure the plugin Email-Ext is installed
        Configure email sending: Follow URL: https://www.360logica.com/blog/email-notification-in-jenkins/
9. Document installation of Jboss and console
	https://stackoverflow.com/questions/26907323/jboss-wildfly-starts-but-cant-connect
	https://vitux.com/install-and-configure-wildfly-jboss-on-ubuntu/
	https://www.baeldung.com/wildfly-change-default-port
10. Sonarqube details, plugin config etc
	https://www.vultr.com/docs/how-to-install-sonarqube-on-ubuntu-16-04
11. Nagios: https://www.digitalocean.com/community/tutorials/how-to-install-nagios-4-and-monitor-your-servers-on-ubuntu-16-04
12. Chromedriver: https://tecadmin.net/setup-selenium-chromedriver-on-ubuntu/
13. K8N: https://www.youtube.com/watch?v=GTRS9zRWs80
14. Kubectl: https://kubernetes.io/docs/tasks/tools/install-kubectl/
   	Commands:
	gcloud container clusters create sp-cluster --zone=asia-south1-a
