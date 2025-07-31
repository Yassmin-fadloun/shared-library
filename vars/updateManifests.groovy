def call() {
    script {
        sh """
            sed -i 's|image: .*|image: yassminfadloun/your-app:${env.BUILD_NUMBER}|g' K8s/deployment.yaml
        """
    }
}
