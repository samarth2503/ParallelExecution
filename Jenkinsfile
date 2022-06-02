pipeline {
    
    agent any
     
    stages {
        stage('Build') {
            
            agent any
            options {
               skipDefaultCheckout()
            }
            steps {
                echo 'Hello world'
                sleep 2
            }
        }
        
        stage('Deploy') {
            
            steps {
                echo 'Inside Deploy Stage'
                sleep 2
            }
        }
    }
}
