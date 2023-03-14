pipeline {
    agent any
    stages {
        stage ('Git Pull') {
            steps {
                git url: 'https://github.com/budcoded/CalculatorDevOps.git',
                branch: 'main'
            }
        }
        stage ('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage ('Build Docker Images') {
            steps {
                sh 'docker build -t budcoded/calculator:latest .'
            }
        }
     }
}
