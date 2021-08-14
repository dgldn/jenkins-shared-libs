def call() {
  pipeline {
    agent any
    stages {
      stage('hello') {
        steps {
          sh "echo Datta Giri"
        }
      }
    }
  }
}
