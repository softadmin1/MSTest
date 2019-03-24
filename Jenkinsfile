pipeline {
  environment {
    registry = "softcloudhub/demoboot"
    registryCredential = "dockerhubaccount"
    dockerImage = ""
  }
  agent any
  tools {
        maven 'Maven 3.6.0'
  }
  stages {
    stage('Cloning Git') {
      steps {
        echo '>>>>>>>>>>>>>>  Start getting source code from Jithub'
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'githubaccount', url: 'https://github.com/softadmin1/MSTest.git']]])
        echo '>>>>>>>>>>>>>>  Finished getting source code from Jithub'
      }
    }
    stage('Building Source Code') {
      steps{
        script {
          sh "mvn clean install"
        }
      }
    }
    stage('Building Docker Image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image') {
      steps{
       script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
       }
      }
    }
    stage('Remove Unused docker image') {
      steps{
        sh "docker rmi $registry:$BUILD_NUMBER"
      }
    }
  }
}
