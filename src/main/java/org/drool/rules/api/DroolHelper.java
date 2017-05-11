package org.drool.rules.api;


import javax.ejb.Stateless;
import java.util.List;

@Stateless
public interface DroolHelper {
    List<Object> applyRules(List<Object> products);
}