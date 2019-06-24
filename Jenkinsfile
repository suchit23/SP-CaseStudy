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
                //sh label: 'Running SP-CaseStudy-Build - Sonar Code Analysis', script: 'scripts/sonar.sh' 
                junit 'integration-testing/target/failsafe-reports/*.xml'
                //sh label: 'Running SP-CaseStudy-Build - Deploy WAR', script: 'scripts/deploy.sh' 
                //sh label: 'Running SP-CaseStudy-Build - Build Docker and Push', script: 'scripts/docker-create-push-image.sh' 
            } 
        } 
    } 
} 