pipeline {
   agent any

   stages {
          stage ('Compile Stage') {

            steps {
                    bat 'mvnw clean compile'
            }
        }
        stage('test') {
         steps {

            bat "mvnw test"
         }
        }
      stage('Build') {
         steps {
            bat "mvnw compile jib:dockerBuild"
         }

         post {
            // If Maven was able to run the tests, even if some of the test
            // failed, record the test results and archive the jar file.
            success {
               junit '**/target/surefire-reports/TEST-*.xml'
            }
         }
      }
   }
}
