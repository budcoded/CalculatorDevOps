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
                sh 'docker login -u budcoded -p budcodedbudcoded'
                sh 'docker push budcoded/calculator:latest'
            }
        }
        stage ('Copy Log File') {
            sh 'docker start AjayCalc'
            sh 'echo 14plmn75 | sudo -s docker cp AjayCalc:application.log /home/budcoded/Desktop'
        }
        stage ('Docker Container Delete') {
            steps {
                sh 'docker stop AjayCalc || true'
                sh 'docker rm AjayCalc || true'
            }
        }
        stage ('Deploy and Run Image') {
            steps {
                sh 'ansible-playbook -i inventory playbook.yml'
            }
        }
    }
}
