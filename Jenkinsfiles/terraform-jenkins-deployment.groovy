pipeline {
    agent any

    environment{
    	GCP_PROJECT_ID		= 'ssh-devops1-dev-2025'
    	// nothing to mention as of now
    }


    stages {
	    
        stage('Hello This is the git passkey token name: "Surpass" ') {
	steps {
		dir("infraGCP") {
			script {
				withCredentials([
					file(
						credentialsId: 'ssh-devops1-dev-2025',
						variable: 'GOOGLE_APPLICATION_CREDENTIALS'
					)
				]) {
					echo 'Hello This is the git passkey token name: "Surpass"'
					// sh "cat $GOOGLE_APPLICATION_CREDENTIALS"

					// Optionally, ensure the repo is checked out before pulling
					checkout([$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[url: 'https://github.com/suprit123h/gcp-ssh-2025-wisdom-dev.git']]])
					// git pull "https://github.com/suprit123h/gcp-ssh-2025-wisdom-dev.git"

					sh '''
						git pull origin master
						pwd
						ls
                                                mv ${GOOGLE_APPLICATION_CREDENTIALS} ssh-devops1-dev-2025.json
                                                rm -rf *.tfstate
						terraform init
						terraform plan
						terraform destroy -auto-approve -no-color --disable_dependent_services = True
					'''
				}
			}
		}
	}
        }
    }
}
