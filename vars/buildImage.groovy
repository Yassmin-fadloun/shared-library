def call() {
    script {
        docker.build("${env.DOCKER_IMAGE}")
    }
}
