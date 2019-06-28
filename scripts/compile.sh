#!/bin/bash
echo "******* :: Starting Compile Tasks :: *******"
echo ""

cd java_web_code
date > src/main/webapp/date.txt
mvn install
cd ..
