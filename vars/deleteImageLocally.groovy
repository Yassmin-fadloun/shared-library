def call() {
    script {
        sh "docker rmi ${env.DOCKER_IMAGE} || true"
    }
}
