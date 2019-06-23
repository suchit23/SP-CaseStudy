#!/bin/bash
echo "******* :: Starting Deploy Tasks :: *******"
echo ""

cd java_web_code/
sudo cp target/wildfly-spring-boot-sample-1.0.0.war /opt/wildfly/standalone/deployments/
cp target/wildfly-spring-boot-sample-1.0.0.war ../docker/
cd ..