pipeline {
  environment {
    registry = "softcloudhub/demoboot"
    registryCredential = ‘dockerhub-account’
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/softadmin1/MSTest'
      }
    }
    stage('Building image') {
      steps{
        script {
          docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
  }
}
