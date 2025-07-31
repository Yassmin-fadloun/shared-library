def call(String imageTag = "${env.DOCKER_IMAGE}") {
    script {
        // Always use your real Docker Hub repo
        def fullImageTag = "yassminfadloun/your-app:${env.BUILD_NUMBER}"
        sh "docker build -t ${fullImageTag} ."
        // Update the environment variable so pushImage.groovy uses it too
        env.DOCKER_IMAGE = fullImageTag
    }
}
