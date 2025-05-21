pipeline {
    agent any
    
    parameters{
    	string(name: 'pipeline value', description: 'just checking the parameters option', defaultValue: 'NA')
        string(name: 'opetions value', description: 'just checking the options', defaultValue: 'NA')
	choice(name: 'pipeline choices', choices: ['first pipeline', 'second pipeline'], description: 'nothing to describe here' )
    }

    environment{
    	GCP_PROJECT_ID		= 'gcp'
    	// nothing to mention as of now
    }


    stages {
        stage('Hello This is the git passkey token name: "Surpass" ') {
            steps {
                script {
                    println('Hello This is the git passkey token name: "Surpass"')
		    sh "cd /home/suprit_local/"
		    sh "pwd"
		    sh "mkdir -p test_files"
		    sh "cd test_files"
		    sh "touch testingfile"
                }
            }
        }
    }
}
