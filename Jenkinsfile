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
        echo '>>>>>>>>>>>>>>  Start getting source code from Jithub'
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'githubaccount', url: 'https://github.com/softadmin1/MSTest.git']]])
        echo '>>>>>>>>>>>>>>  Finished getting source code from Jithub'
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
