def call() {
    stage('Update Manifests ') {
        echo 'Updating Kubernetes manifests (YAML files) using sed...'
        sh """
            grep 'image:' K8s/deployment.yaml || echo 'No image line found!'
            cd $WORKSPACE
            sed -i "s|image:.*|image: yassminfadloun/your-app:$BUILD_NUMBER|" K8s/deployment.yaml
        """
    }
}
