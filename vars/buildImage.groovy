def call(String imageTag = "${env.DOCKER_IMAGE}") {
    script {
        sh "docker build -t ${imageTag} ."
    }
}
