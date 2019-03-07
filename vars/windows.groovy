def call(node, Closure body) {
    node(node) {
        body()
    }
}