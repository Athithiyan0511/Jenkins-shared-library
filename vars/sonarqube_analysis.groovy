def call(String sonarToolName, String projectKey, String projectName) {
    def scannerHome = tool(sonarToolName)

    withSonarQubeEnv('SonarQube') {
        sh '''
            $SCANNER_HOME/bin/sonar-scanner
        '''
    }
}
