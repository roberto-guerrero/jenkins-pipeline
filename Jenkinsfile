pipeline {
    agent any
    tools {
        maven 'Default'
    }
    stages {
        stage ('Compile Stage'){
            steps {
                bat sh 'mvn clean compile'
            }
        }

        stage ('Testing stage') {
            steps {
                bat sh 'mvn test'
            }
        }

    }

}