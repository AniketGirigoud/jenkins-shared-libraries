def call(string Project, String ImageTag, string dockerHubUser ){
 withCredentials([usernamePassword(credentialsId:"dockerhubid",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
                }
}
