node {
   stage('Preparation') { // for display purposes
      git 'https://github.com/lepffm/time-tracker.git'
   }
   stage('Build') {
       sh 'mvn clean test findbugs:findbugs checkstyle:checkstyle pmd:pmd -q'
       checkstyle pattern: '**/target/checkstyle-result.xml'
       pmd canRunOnFailed: true, pattern: '**/target/pmd.xml'
       findbugs pattern: '**/core/target/findbugsXml.xml'
       junit 'core/target/surefire-reports/Test*.xml'
   }
   stage('Results') {
      //archiveArtifacts '**/target/*.jar,**/target/*.war'
      //deploy adapters: [tomcat7(credentialsId: 'tomcat-admin', path: '', url: 'http://jm1:8080/')], contextPath: '/multi3-3.9-jgnam', onFailure: false, war: 'multi3/target/*.war'
   }
}
