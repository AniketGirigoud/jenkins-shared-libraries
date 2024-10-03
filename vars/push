def call(string Project, String ImageTag, string dockerHubUser ){
 withCredentials([usernamePassword(credentialsId:"dockerhubid",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
                }
}
