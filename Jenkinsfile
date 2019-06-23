pipeline {
    agent {
        label 'master'
    }
    stages {
  
        stage('SP-CaseStudy-Build') {
            agent {
            label 'master'
            }
            steps {
                echo 'Running SP-CaseStudy-Build - Compile Code'
                sh label: 'Call compile.sh script', script: 'scripts/compile.sh'
                echo 'Running SP-CaseStudy-Build - Run JUnit'
                sh label: 'Call junit-test.sh script', script: 'scripts/junit-test.sh'
            }
            steps {
                echo 'Running SP-CaseStudy-Build - Sonar Code Analysis'
                //TBD
            }
            steps {
                echo 'Running SP-CaseStudy-Build - Deploy WAR'
                sh label: 'Call deploy.sh script', script: 'scripts/deploy.sh'
                echo 'Running SP-CaseStudy-Build - Build Docker and Push'
                sh label: 'Call docker-create-push-image.sh script', script: 'scripts/docker-create-push-image.sh'
            }

        }
    }
}