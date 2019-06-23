#!/bin/bash
echo "******* :: Starting JUnit Test Tasks :: *******"
echo ""

cd ../integration-testing/
mvn clean verify -P integration-test