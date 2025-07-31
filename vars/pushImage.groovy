def call(String imageName, String imageTag) {
    withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', 
                                       usernameVariable: 'DOCKER_USER', 
                                       passwordVariable: 'DOCKER_PASS')]) {

        sh """
            echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin docker.io

            # Tag the image with full Docker Hub path
            docker tag ${imageName}:${imageTag} docker.io/${DOCKER_USER}/${imageName}:${imageTag}

            # Push to Docker Hub
            docker push docker.io/${DOCKER_USER}/${imageName}:${imageTag}
        """
    }
}
