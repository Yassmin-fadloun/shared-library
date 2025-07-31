def call() {
    stage('Push Manifests ') {
        // Use Secret Text for GitHub token
        withCredentials([string(credentialsId: 'github-pat', variable: 'GIT_TOKEN')]) {
            sh '''
                git config user.name "Jenkins"
                git config user.email "jenkins@example.com"
                git remote set-url origin https://x-access-token:${GIT_TOKEN}@github.com/Yassmin-fadloun/shared-library.git
                git fetch origin
                git checkout -B main origin/main
                git add -A
                git commit -m "Update manifests from Jenkins pipeline" || echo "No changes"
                git push origin main
            '''
        }
    }
}
