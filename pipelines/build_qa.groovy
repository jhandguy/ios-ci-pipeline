pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'iOS QA Build!'
            }
        }
    }
}
