package net.flinkgutt.demo.module.c;

import java.util.ArrayList;
import java.util.List;
import net.flinkgutt.demo.module.a.Com;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Christian
 */
@ServiceProvider(service=Com.class)
public class ComImpl implements Com{
    
    @Override
    public List<String> getFooBar() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("ComImpl #"+i);
        }
        return strings;
    }
}
