pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/champcloud514/your-repo.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'javac Main.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java Main'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: '**/*.class', fingerprint: true
            }
        }
    }
}
