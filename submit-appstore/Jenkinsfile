pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Building App...'
                sleep 30
            }
        }
        stage('submit') {
            steps {
                echo 'Submitting to Appstore...'
                sleep 30
            }
        }
        stage('post') {
            steps {
                echo 'Message Posted on Slack!'
            }
        }
    }
}
