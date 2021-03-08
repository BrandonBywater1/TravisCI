pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn test -f ./pom.xml'
      }
    }

  }
}