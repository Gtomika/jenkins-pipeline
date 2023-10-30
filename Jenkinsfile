Pipeline {
    Agent: any

    Tools {
        Maven 'maven3'
    }

    Stages {
        Stage('Code Checkout') {
            Steps {
                Checkout([
                    $class: 'GitSCM',
                    Branches: [[name: '*/master']],
                    UserRemoteConfigs: [[url: 'https://github.com/spring-projects/spring-petclinic.git']]
                ])
            }
        }

        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying.... TODO'
            }
        }
    }
}