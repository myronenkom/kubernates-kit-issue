package org.vaadin.example;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope(value = "vaadin-ui", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class VaadinUiScopeBean implements Serializable {

    public void testMe() {
        System.out.println("I'm working");
    }
}
