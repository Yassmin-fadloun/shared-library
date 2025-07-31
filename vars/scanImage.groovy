def call() {
    script {
       sh "trivy image --severity CRITICAL --exit-code 0 ${env.DOCKER_IMAGE}"
    }
}
