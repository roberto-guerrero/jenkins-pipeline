pipeline {
    agent any
    tools {
        maven 'Default'
    }
    stages {
        stage('version') {
            steps {
                sh 'mvn --version'
            }
        }
        stage ('Compile Stage'){
            steps {
                sh 'mvn clean compile'
            }
        }

        stage ('Testing stage') {
            steps {
                sh 'mvn test'
            }
        }

    }

}