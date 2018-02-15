package tech.law.hanreidb.unit.plugin;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * WebとJobで再利用するためだけのしがないクラス。
 * @author jflute
 */
public class TestPluginAgent {

    public void setUpBatchly(Set<TestPlugin> testPluginSet) {
        testPluginSet.forEach(testPlugin -> testPlugin.setUp());
    }

    public void tearDownBatchly(Set<TestPlugin> testPluginSet) {
        List<TestPlugin> reversedPluginList = new ArrayList<>(testPluginSet);
        Collections.reverse(reversedPluginList); // 登録順の逆順 (順序キープしたSetであること前提)
        reversedPluginList.forEach(testPlugin -> testPlugin.tearDown());
    }

    public TestPlugin findTestPlugin(Set<TestPlugin> testPluginSet, Class<?> testPluginClass) {
        return testPluginSet.stream().filter(testPlugin -> {
            return testPluginClass.isAssignableFrom(testPlugin.getClass());
        }).findFirst().get();
    }
}