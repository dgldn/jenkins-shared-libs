def call() {
  pipeline {
    agent any
    stages {
      stage('hello') {
        steps {
          helloWorld("Datta Giri")
        }
      }
    }
  }
}
