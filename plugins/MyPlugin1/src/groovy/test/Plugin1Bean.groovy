package test

/**
 * Created by mike on 3/9/2015.
 */
class Plugin1Bean {
    String message = "Message from Plugin1."

    def getPlugin2Message() {
        Plugin2Bean bean = new Plugin2Bean()
        return bean.message
    }
}
