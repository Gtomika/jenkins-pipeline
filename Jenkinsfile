pipeline {
    agent {
        //Jenkins should have this label configured
        //agents with this label should have maven and Java 21 installed
        label 'amazon-linux-maven-java-21'
    }

    environment {
        APP_NAME = 'Jenkins Demo Pipeline'
    }

    stages {
        stage('Cleanup Workspace') {
            steps {
                cleanWs()
                sh 'echo "Cleaned Up Workspace for ${APP_NAME}"'
            }
        }

        stage('Checkout') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/master']],
                    userRemoteConfigs: [[url: 'https://github.com/Gtomika/jenkins-pipeline.git']]
                ])
                sh 'echo "Checked out app ${APP_NAME}"'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn install -Dmaven.test.skip=true'
                sh 'echo "Build completed for app ${APP_NAME}"'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
                sh 'echo "Tests completed for app ${APP_NAME}"'
            }
        }

        stage('Deploy') {
            steps {
                sh 'echo "Deploying...."'
            }
        }
    }
}