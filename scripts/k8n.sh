#!/bin/bash
echo "******* :: Starting Kubernetes Deployment Tasks :: *******"
echo ""

cd scripts
kubectl delete deployment sp-deployment
kubectl apply -f k8n-deployment.yaml