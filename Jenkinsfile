pipeline {
    agent {
        node {
            label 'maven'
        }
    }

    parameters {
        string(name:'TAG_NAME', defaultValue: '', description:'')
    }

    environment {
        AAA_BBB_ID = 'dockerhub-id'
    }

    stages {
        steps {
            echo 'Building..'
        }
    }
}