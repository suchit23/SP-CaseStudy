pipeline { 
    agent none 
        options { 
        timestamps() 
        } 
    stages { 
        stage('SP-CaseStudy-Build') { 
            agent { 
            label 'master' 
            } 
            steps { 
                sh label: 'Running SP-CaseStudy-Build - Compile Code', script: 'scripts/compile.sh' 
                sh label: 'Running SP-CaseStudy-Build - JUnit Test', script: 'scripts/junit-test.sh' 
                sh label: 'Running SP-CaseStudy-Build - Sonar Code Analysis', script: 'scripts/sonar.sh' 
                junit 'integration-testing/target/failsafe-reports/*.xml'
                sh label: 'Running SP-CaseStudy-Build - Deploy WAR', script: 'scripts/deploy.sh' 
                sh label: 'Running SP-CaseStudy-Build - Build Docker and Push', script: 'scripts/docker-create-push-image.sh' 
            } 
        }
        stage('SP-CaseStudy-Test') { 
            agent { 
            label 'sp-test' 
            } 
            steps { 
                sh label: 'Running SP-CaseStudy-Test - Docker Pull & Run', script: 'scripts/docker-pull-run.sh' 
                sh label: 'Running SP-CaseStudy-Test - Selenium Test', script: 'scripts/selenium-test.sh' 
                junit 'selenium-test/target/surefire-reports/*.xml'
            } 
        }
        stage('SP-CaseStudy-Deploy') { 
            agent { 
            label 'sp-test' 
            } 
            steps { 
                sh label: 'Running SP-CaseStudy-Deploy - Kubernetes Deployment', script: 'scripts/k8n.sh' 
            } 
        } 
    } 
} 