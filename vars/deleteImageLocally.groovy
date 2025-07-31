def call() {
    stage('Delete Image Locally ') {
        echo ' Deleting local Docker image...'
        sh """ docker rmi yassminfadloun/your-app:$BUILD_NUMBER|| true"""
    }
}
