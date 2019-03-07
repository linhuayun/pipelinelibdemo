def call(noden, Closure body) {
    node(noden) {
        body()
    }
}