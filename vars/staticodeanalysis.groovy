def call(credentialsId){
    withSonarQubeEnv(credentialsId: credentialsId) {
    sh 'mvn clean ackage sonar:sonar'}
}