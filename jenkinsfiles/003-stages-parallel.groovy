pipeline {
  agent any
  stages {

    stage('Stage 1') {
      steps {
        script {
          echo 'This whole pipeline will take ~20sec to finish.'
        }
      }
    }

    stage('Parallel stages') {
      parallel {

        stage('Stage 2') {
          steps {
            script {
              echo "stage2"
            }
          }
        }

        stage('Stage 3') {
          steps {
            script {
              echo "stage 3"
            }
          }
        }

      }
    }

  }
}
