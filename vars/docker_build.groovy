def call(Sring ImageName, String ImageTag, String DockerHubUser){
  sh 'docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} .'
}
