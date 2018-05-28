pipeline {
    agent any
    tools {
        maven 'Default'
    }
    stages {
        stage('version') {
            steps {
                bat 'mvn --version'
            }
        }
        stage ('Compile Stage'){
            steps {
                bat 'mvn clean compile'
            }
        }

        stage ('Testing stage') {
            steps {
                bat 'mvn test'
            }
        }

    }

}