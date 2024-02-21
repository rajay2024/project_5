pipeline {
    agent { 
        node {
            label 'my_pc'
            }
      }
    triggers {
        pollSCM '* * * * *'
    }
     stages {
        stage('Build') {
            steps {
                echo "Building.."
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh '''
                python hello.py
                '''
            }
        }
        stage('Deliver') {
            steps {
                echo "Delivery.."
            }
        }
    }
}
