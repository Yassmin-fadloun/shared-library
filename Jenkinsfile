@Library('shared-library') _

pipeline {
    agent any

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
}
