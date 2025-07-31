def call() {
    script {
        sh "trivy image --severity CRITICAL --exit-code 1 yassminfadl0un/your-app:${env.BUILD_NUMBER}"
    }
}
