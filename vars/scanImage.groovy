def call() {
    script {
        sh "trivy image --severity CRITICAL --exit-code 1 ${env.DOCKER_IMAGE}"
    }
}
