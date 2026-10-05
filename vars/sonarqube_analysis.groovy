def call(String sonarToolName, String projectKey, String projectName) {
    def scannerHome = tool(sonarToolName)

    withSonarQubeEnv('SonarQube') {
        sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=${projectKey} -Dsonar.projectName=${projectName}"
    }
}
