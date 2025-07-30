def call(String imageTag = "${env.DOCKER_IMAGE}") {
    script {
        echo "=== Running Trivy scan for image: ${imageTag} ==="
        sh """
        # Run Trivy scan, show CRITICAL issues, but don't stop the pipeline if found
        trivy image --severity CRITICAL --exit-code 1 ${imageTag} || true
        """
    }
}
