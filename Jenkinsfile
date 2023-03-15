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
        stage('Deploy and Run Image'){
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }
    }
}
