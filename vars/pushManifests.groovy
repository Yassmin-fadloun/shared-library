def call() {
    script {
        withCredentials([usernamePassword(
            credentialsId: 'github-creds',
            usernameVariable: 'GIT_USER',
            passwordVariable: 'GIT_PASS'
        )]) {
            sh """
                git config --global user.email "jenkins@example.com"
                git config --global user.name "Jenkins"
                git add .
                git commit -m 'Updated manifests for ${env.BUILD_NUMBER}'
                git push https://${GIT_USER}:${GIT_PASS}@github.com/Shahdhussien/shared-library-repo-.git HEAD:main
            """
        }
    }
}
