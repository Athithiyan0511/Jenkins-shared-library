def call() {
    sh '''
        if command -v dependency-check.sh >/dev/null 2>&1; then
            dependency-check.sh --project "Wanderlust" --scan . --format XML --out . --noupdate --disableNodeAudit
        elif command -v dependency-check >/dev/null 2>&1; then
            dependency-check --project "Wanderlust" --scan . --format XML --out . --noupdate --disableNodeAudit
        else
            echo "OWASP Dependency-Check CLI is not installed on this Jenkins agent."
            exit 1
        fi
    '''
}
