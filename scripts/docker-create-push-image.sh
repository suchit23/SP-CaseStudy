#!/bin/bash
echo "******* :: Starting Docker Tasks :: *******"
echo ""

cd docker/

echo "******* :: Starting Docker Build Tasks :: *******"
echo ""
sudo docker build -t suchit23/sp-casestudy-docker-image .

echo "******* :: Starting Docker Push Tasks :: *******"
echo ""
sudo docker login -u suchit23 -p Hrishita23@
sudo docker push suchit23/sp-casestudy-docker-image
cd ..
