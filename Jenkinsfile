node {
   stage('Preparation') { // for display purposes
      git 'https://github.com/lepffm/time-tracker.git'
   }
   stage('Build') {
       sh 'mvn package findbugs:findbugs checkstyle:checkstyle pmd:pmd -q -Dmaven.test.failure.ignore=true'
       junit 'core/target/surefire-reports/*.xml'
       checkstyle pattern: '**/target/checkstyle-result.xml'
       pmd canRunOnFailed: true, pattern: '**/target/pmd.xml'
       findbugs pattern: '**/core/target/findbugsXml.xml'
   }
   stage('Results') {
      //archiveArtifacts '**/target/*.jar,**/target/*.war'
      //deploy adapters: [tomcat7(credentialsId: 'tomcat-admin', path: '', url: 'http://jm1:8080/')], contextPath: '/multi3-3.9-jgnam', onFailure: false, war: 'multi3/target/*.war'
   }
}
