pipeline {
  agent {
    node {
      label 'maven'
    }
  }

  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/ggboy-shakalaka/simple-springboot.git', branch: 'master', changelog: true, poll: false)
      }
    }

    stage('Maven Build') {
      steps {
        container('maven') {
          sh 'mvn -o -Dmaven.test.skip=true clean package'
        }
      }
    }

    stage('Docker Build') {
      steps {
        container('maven') {
          sh 'docker rmi harbor.habq.com/zhaizq/test:0.5'
          sh 'docker build -f Dockerfile -t harbor.hnhabq.com/zhaizq/test:0.5 .'
        }
      }
    }

    stage('Docker push') {
      steps {
        container('maven') {
          sh 'echo Habq@123|docker login http://harbor.hnhabq.com -u habq --password-stdin'
          sh 'docker push harbor.hnhabq.com/zhaizq/test:0.5'
        }
      }
    }

    stage('Deploy') {
      steps {
        input(id: 'deploy-to-production', message: 'deploy to production?')
        echo 'Deploy!'
      }
    }
  }
}