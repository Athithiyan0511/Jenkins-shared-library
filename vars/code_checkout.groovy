def call(String repoUrl, String branch = 'main') {
    def normalizedUrl = repoUrl.replaceFirst(/^git@github.com:/, 'https://github.com/')
    git branch: branch, url: normalizedUrl
}
