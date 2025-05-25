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
				),
			    usernamePassword(
				    credentialsId: "81dead19-04f7-4a8a-91c2-84adc1e8b1f1",
				    usernameVariable: "git_username",
				    passwordVariable: "git_password"
				    )
			    ]){
			    sh "echo $git_username, $git_password"
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
