package org.drool.rules.impl;

import org.drool.rules.api.DroolHelper;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import javax.annotation.PostConstruct;
import java.util.List;

public class DroolHelperImpl implements DroolHelper {
    private KieServices kieServices;
    private KieContainer kieClasspathContainer;

    @PostConstruct
    private void initialization() {
        kieServices = KieServices.Factory.get();
        kieClasspathContainer = kieServices.getKieClasspathContainer();
    }

    public List<Object> applyRules(List<Object> products) {
        KieSession kieSession = kieClasspathContainer.newKieSession( "ksession-rules");
        products.forEach( object -> kieSession.insert(object));
        kieSession.fireAllRules();
        kieSession.dispose();
        return products;
    }
}
