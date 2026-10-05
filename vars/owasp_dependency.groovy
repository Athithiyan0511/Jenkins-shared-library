def call() {
    sh '''
        if command -v dependency-check.sh >/dev/null 2>&1; then
            dependency-check.sh --project "Wanderlust" --scan . --format XML --out . --noupdate
        elif command -v dependency-check >/dev/null 2>&1; then
            dependency-check --project "Wanderlust" --scan . --format XML --out .
        else
            dependency-check --project "Wanderlust" --scan . --format XML --out . --noupdate
            exit 1
        fi
    '''
}
