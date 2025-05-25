pipeline {
    agent any

    environment{
    	GCP_PROJECT_ID		= 'ssh-devops1-dev-2025'
    	// nothing to mention as of now
    }


    stages {
        stage('Hello This is the git passkey token name: "Surpass" ') {
            steps {
	    	dir("infraGCP"){
                script {

		    withCredentials([
			file(
				credentialsId: "ssh-devops1-dev-2025",
				variables: 'GOOGLE_APPLICATION_CREDENTIALS'
				)
			    ]){
			sh "cat GOOGLE_APPLICATION_CREDENTIALS"
                    println('Hello This is the git passkey token name: "Surpass"')
			sh "pwd ${WORKSPACE}"

		    sh '''
                       git pull https://github.com/suprit123h/gcp-ssh-2025-wisdom-dev.git
		       cd gcp-ssh-2025-wisdom-dev
	               pwd
		       ls
	 
	               terraform init
                       terraform plan
                     '''
		    }
		   }

                }
            }
        }
    }
}
