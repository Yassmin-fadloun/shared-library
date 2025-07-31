def call() {
    stage('Push Image') {
        echo 'Pushing Docker image to registry...'
        withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
            sh '''
                # Convert username to lowercase for DockerHub
                dockerUser=$(echo "$DOCKER_USER" | tr '[:upper:]' '[:lower:]')

                # Login securely without exposing password in Groovy
                echo "$DOCKER_PASS" | docker login -u "$dockerUser" --password-stdin

                # Tag and push the image
                docker tag "$dockerUser/your-app:$BUILD_NUMBER" "$dockerUser/your-app:$BUILD_NUMBER"
                docker push "$dockerUser/your-app:$BUILD_NUMBER"
            '''
        }
    }
}
