def call() {
    stage('Push Image ') {
        echo 'Pushing Docker image to registry...'
        withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
            sh """
                echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
                docker tag yassminfadloun/your-app:$BUILD_NUMBER $DOCKER_USER/your-app:$BUILD_NUMBER
                docker push $DOCKER_USER/your-app:$BUILD_NUMBER
            """
        }
    }
}
