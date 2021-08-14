def call() {
    stages {
      stage('hello') {
        steps {
          helloWorld("Datta Giri")
        }
      }
    }
}
