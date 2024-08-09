pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Clean and compile the Maven project
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Package and deploy the Maven project (this might vary depending on your deployment strategy)
                sh 'mvn package'
                // Optionally, add a deploy command
                // sh 'mvn deploy' (uncomment if you have a deploy stage in Maven)
            }
        }
    }
}
S