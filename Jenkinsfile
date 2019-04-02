node {

  init()
    checkout()
    build()
    unitTest()
    deploy()
    sonarPreview()
    sonarQualityGate()



}
   def init(){
       stage ('Initialize') {

                echo "PATH = ${PATH}"
                 echo "M2_HOME = ${M2_HOME}"
                 echo "${env.JOB_NAME}"
                 echo "${env.BUILD_NUMBER}"
                 echo "${env.BUILD_URL}"
                 echo "${env.JAVA_HOME}"
                 echo "${env.PATH}"


        }
   }
   def checkout(){
        stage 'Checkout code'
        git 'https://github.com/csillamolnar/DemoPipeline.git'
   }
   def build(){
        stage 'Build'
        bat 'mvn clean install -Dmaven.test.failure.ignore=true -Dmaven.javadoc.skip=true -Dcheckstyle.skip=true'
   }

   def unitTest() {
    stage 'Unit tests'
    bat 'mvn test -Dmaven.javadoc.skip=true -Dcheckstyle.skip=true'
    if (currentBuild.result == "UNSTABLE") {
        sh "exit 1"
    }
   }
    def deploy(){
        stage 'Deploy'
        bat 'mvn package'

    }

    def sonarPreview(){
        stage ('SonarQube Analysis'){
        withSonarQubeEnv('sonar-1'){
            bat 'mvn sonar:sonar -Dsonar.host.url=http:localhost:9000 -Dsonar.login=6ac00ea0757f2f23c2f61d1ac12f235a81f85f5c'
        }
    }
    }

    def sonarQualityGate(){
            stage("Quality Gate"){
          timeout(time: 1, unit: 'HOURS') {
              def qg = waitForQualityGate()
              if (qg.status != 'OK') {
                  error "Pipeline aborted due to quality gate failure: ${qg.status}"

                  String jobDetails = "${env.JOB_NAME} (${env.BUILD_NUMBER}) \n Something is wrong with the build. Please go to ${env.BUILD_URL} \n"
                    message = jobDetails
                   mail bcc: '', body: "${message}", cc: '', from: '', replyTo: '', subject: 'Failed Pipeline: ${env.JOB_NAME}', to: 'csilla83.molnar@gmail.com'

              }
              else{
               String message = "${env.JOB_NAME} (${env.BUILD_NUMBER}) \n Please go to ${env.BUILD_URL} \n"

           mail bcc: '', body: "${message}", cc: '', from: '', replyTo: '', subject: 'Jenkins Job Success', to: 'csilla83.molnar@gmail.com'

              }
          }
     }
    }
