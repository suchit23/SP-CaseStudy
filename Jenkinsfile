stage('compile-code') {
  stages {
    sh label: '', script: 'scripts/compile.sh'
  }

  agent {
    label 'master'
  }

  options {
    timeout(10)
    timestamps
    warnError('Error in compile-code stage')
  }
}

