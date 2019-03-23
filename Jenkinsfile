pipeline {
    agent any
    tools {
        maven 'Maven 3.6.0'
    }
    stages {
        stage('Download Soure code') {
            steps {
                echo '>>>>>>>>>>>>>>  Start getting source code from Jithub'
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-account', url: 'https://github.com/softadmin1/MSTest.git']]])
                echo '>>>>>>>>>>>>>>  Finished getting source code from Jithub'
            }
        }
        stage('Build') {
            steps {
                echo '>> Start Building using MVN plugin installed'
                sh "mvn clean install"
                sh "mvn package"
                echo '>> Finished Building using MVN plugin installed'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
