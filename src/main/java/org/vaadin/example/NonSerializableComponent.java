package org.vaadin.example;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.spring.annotation.SpringComponent;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

@SpringComponent
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class NonSerializableComponent extends VerticalLayout {

    private final VaadinUiScopeBean vaadinUiScopeBean;

    public NonSerializableComponent(VaadinUiScopeBean vaadinUiScopeBean) {
        this.vaadinUiScopeBean = vaadinUiScopeBean;
    }

    @PostConstruct
    private void postInit() {
        this.add(vaadinUiScopeBean);
    }
}
