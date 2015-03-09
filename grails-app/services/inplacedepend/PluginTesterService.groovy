package inplacedepend

import test.Plugin1Bean

class PluginTesterService {

    def serviceMethod() {
        Plugin1Bean bean = new Plugin1Bean()
        return bean.message + " " + bean.getPlugin2Message()
    }
}
