pipeline 
{
  agent any
  stages
   {
    stage('Build')
      {
      steps {
        withMaven (maven : 'maven_latest')
              {
                sh 'mvn clean install'
              }
            }
      }
  }
}

