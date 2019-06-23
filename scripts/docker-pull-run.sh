#!/bin/bash
echo "******* :: Starting Docker Pull Tasks :: *******"
echo ""

CONTAINER=$(sudo docker ps -a | grep suchit23 | awk '{print $1}')
echo "Found container ID" $CONTAINER 
sudo docker rm -f $CONTAINER

echo "******* :: Starting Docker Pull & Run Tasks :: *******"
echo ""
sudo docker pull suchit23/sp-casestudy-docker-image
sudo docker run -itd -p 80:8080 suchit23/sp-casestudy-docker-image
echo ".....waiting 30 seconds for container to be in RUNNING stage....."
sleep 30