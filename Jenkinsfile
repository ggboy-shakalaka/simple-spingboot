pipeline {
    agent any

    parameters {
        string(name:'TAG_NAME', defaultValue: '', description:'input tag')
    }

    environment {
        AAA_BBB_ID = 'dockerhub-id'
    }

    stages {
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
    }
}
