def call() {
    stage('Scan Image ') {
        echo ' Scanning Docker image...'
        withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
        sh """
        pwd
        trivy image yassminfadloun/your-app:$BUILD_NUMBER
        """
        }
    }
}
