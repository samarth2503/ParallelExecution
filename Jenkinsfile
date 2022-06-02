pipeline {
    
    agent any
     
    stages{
        
        agent any
        
        options {
            skipDefaultCheckout()
        }
        
        stage('Build') {
            
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
