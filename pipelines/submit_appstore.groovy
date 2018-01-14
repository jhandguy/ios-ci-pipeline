pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Building App...'
                sleep 1
            }
        }
        stage('submit') {
            steps {
                echo 'Submitting to Appstore...'
                sleep 1
            }
        }
        stage('post') {
            steps {
                echo 'Message Posted on Slack!'
            }
        }
    }
}
