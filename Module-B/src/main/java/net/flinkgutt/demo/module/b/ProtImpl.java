
package net.flinkgutt.demo.module.b;

import java.util.ArrayList;
import java.util.List;
import net.flinkgutt.demo.module.a.Prot;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Christian
 */
@ServiceProvider(service = Prot.class)
public class ProtImpl implements Prot {

    @Override
    public List<String> getStrings() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("ProtImpl #"+i);
        }
        return strings;
    }
    
}
