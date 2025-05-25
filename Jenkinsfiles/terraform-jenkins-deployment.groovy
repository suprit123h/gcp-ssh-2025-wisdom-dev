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
                    println('Hello This is the git passkey token name: "Surpass"')
			sh "pwd"
			sh "ls"

		    sh "git pull https://github.com/suprit123h/gcp-ssh-2025-wisdom-dev.git"

		    sh "/var/jenkins_home/workspace/DevOps-Workspace/terraformjobs/bucket_deployment_gcp/infraGCP/gcp-ssh-2025-wisdom-dev/terraform init"

		    sh "/var/jenkins_home/workspace/DevOps-Workspace/terraformjobs/bucket_deployment_gcp/infraGCP/gcp-ssh-2025-wisdom-dev/terraform plan"

		    //sh "gcloud version"
		   }

                }
            }
        }
    }
}
