@Library('shared-library') _

pipeline {
     agent any 

        stages {
        stage('Pipeline Steps') {
            steps {
                buildImage()
                scanImage()
                pushImage()
                deleteImageLocally()
                updateManifests()
                pushManifests()
            }
        }
   }
}

