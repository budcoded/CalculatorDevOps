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
//                 withDockerRegistry([credentialsId: "dockerId", url: ""]) {
//                     sh 'docker push budcoded/calculator:latest'
//                 }
                sh 'docker login -u budcoded -p budcodedbudcoded'
                sh 'docker push budcoded/calculator:latest'
//                 withCredentials() {
//                         def registry_url = "registry.hub.docker.com/"
//                         bat "docker login -u $USER -p $PASSWORD ${registry_url}"
//                         withDockerRegistry("http://${registry_url}", "docker-hub-credentials") {
//                             // Push your image now
//                             sh 'docker push budcoded/calculator:latest'
//                         }
//                     }
            }
        }
//         stage ('Clean Docker Images') {
//             steps {
//                 sh 'docker rmi -f budcoded/calculator:latest'
//             }
//         }
     }
}
