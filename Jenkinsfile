pipeline {
    
    agent any
     
    stages {
        stage('Build') {
            
            when {
               buildingTag()
            }
            
            steps {
                echo 'Hello world'
                sleep 2
            }
        }
    }
}
