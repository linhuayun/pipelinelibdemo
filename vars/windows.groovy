import org.foo.Zot

def call(noden, Closure body) {
    log.info noden
    def z= new Zot() 
    z.checkOutFrom('yyyyyyyy')
    node(noden) {
        body()
    }
}