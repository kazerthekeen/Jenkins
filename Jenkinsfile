pipeline {
    agent any
        stages {
        stage ('Compile Stage') {
            steps {
                withMaven(maven : 'Maven3.6') {
                    bat 'mvn -f pom.xml clean compile'
                   }
            }
        }
        stage ('Testing Stage') {
            steps {
                withMaven(maven : 'Maven3.6') {
                    bat 'mvn -f pom.xml test'
                }
            }
        }
        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'Maven3.6') {
                    bat 'mvn -f pom.xml deploy'
                }
            }
        }
    }
}