@Library('shared-library-repo') _

pipeline {
    agent any
    
    environment {
        DOCKER_IMAGE = "your-docker-repo/your-app:${BUILD_NUMBER}"
    }
    
    stages {
        stage('Build Image') {
            steps {
                buildImage()
            }
        }
        
        stage('Scan Image') {
            steps {
                scanImage()
            }
        }
        
        stage('Push Image') {
            steps {
                pushImage()
            }
        }
        
        stage('Delete Image Locally') {
            steps {
                deleteImageLocally()
            }
        }
        
        stage('Update Manifests') {
            steps {
                updateManifests()
            }
        }
        
        stage('Push Manifests') {
            steps {
                pushManifests()
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
    }
}
