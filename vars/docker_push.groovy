def call(String imageName, String tag, String dockerHubUser) {
    withCredentials([
        usernamePassword(
            credentialsId: 'dockerhub-credentials',
            usernameVariable: 'DOCKER_USERNAME',
            passwordVariable: 'DOCKER_PASSWORD'
        )
    ]) {
        sh '''
            set +x
            echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
        '''
        sh "docker push ${dockerHubUser}/${imageName}:${tag}"
        sh 'docker logout'
    }
}
