
def call(noden, Closure body) {
    log.info noden
    node(noden) {
        body()
    }
}