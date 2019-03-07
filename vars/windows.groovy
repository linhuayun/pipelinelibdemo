import static org.foo.Zot

def call(noden, Closure body) {
    log.info noden
    Zot.checkOutFrom('yyyyyyyy')
    node(noden) {
        body()
    }
}