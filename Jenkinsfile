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
        stage ('Build Docker Image') {
            steps {
                sh 'docker build -t budcoded/calculator:latest .'
            }
        }
        stage ('Push Docker Image') {
            steps {
                withDockerRegistry([credentialsId: "budcoded", url: ""]) {
                    sh 'docker push budcoded/calculator:latest'
                }
            }
        }
//         stage ('Clean Docker Images') {
//             steps {
//                 sh 'docker rmi -f budcoded/calculator:latest'
//             }
//         }
     }
}
