def call() {
    sh '''
        trivy fs --scanners vuln,secret,misconfig --format table .
    '''
}
