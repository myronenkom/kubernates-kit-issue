package org.vaadin.example;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.spring.annotation.SpringComponent;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

@SpringComponent
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class NonSerializableComponent extends VerticalLayout {

    @Autowired
    private VaadinUiScopeBean vaadinUiScopeBean;

    @PostConstruct
    private void postInit() {
    }
}
