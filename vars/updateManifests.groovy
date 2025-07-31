def call() {
    script {
        sh """
            sed -i 's|image: .*|image: yassminfadl0un/your-app:${env.BUILD_NUMBER}|g' K8s/deployment.yaml
        """
    }
}
