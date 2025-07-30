def call() {
    script {
        sh """
            sed -i 's|image: .*|image: ${env.DOCKER_IMAGE}|g' K8s/deployment.yaml
        """
    }
}
