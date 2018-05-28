pipeline {
    agent any
    tools {
        maven 'Maven_3.5.2'
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