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
            echo 'Running SP-CaseStudy-Build'
            sh label: 'Call compile.sh script', script: 'scripts/compile.sh'
            sh label: 'Call junit-test.sh script', script: 'scripts/junit-test.sh'
            }
        }
    }
}