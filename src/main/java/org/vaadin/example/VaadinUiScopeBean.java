package org.vaadin.example;

import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@UIScope
public class VaadinUiScopeBean implements Serializable {

    public void testMe() {
        System.out.println("I'm working");
    }
}
