i#!/bin/bash
echo "******* :: Starting Sonar Analysis Tasks :: *******"
echo ""

mvn clean install sonar:sonar -Dsonar.host.url=http://test.suchit23.in:9000 -Dsonar.login=989b70cc4b3488ac0e212a2cdfd7f898a82051dd -Dsonar.projectKey=SP -Dsonar.projectName=SP-Sonar-Analysis -Dsonar.projectVersion=1.0 -Dsonar.sources=src/main/java/de/vorb/wildfly_springboot -Dsonar.java.binaries=target/classes/de/vorb/wildfly_springboot
