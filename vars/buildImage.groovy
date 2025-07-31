def call() {
    stage('Build Image ') {
        echo ' Building Docker image...'
        sh """docker build -t yassminfadloun/your-app:$BUILD_NUMBER ."""
        
    }
}
