pipeline {
  environment {
    registry = "softcloudhub/demoboot"
    registryCredential = "dockerhubaccount"
  }
  agent any
  tools {
        maven 'Maven 3.6.0'
  }
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/softadmin1/MSTest.gi'
      }
    }
    stage('packaging') {
      steps {
        sh "mvn clean package"
      }
    }
    stage('Building image') {
      steps{
        script {
          docker.build registry + "latest"
        }
      }
    }
  }
}
