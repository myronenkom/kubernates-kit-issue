package org.vaadin.example;

import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.spring.annotation.SpringComponent;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

import java.io.Serializable;

@SpringComponent
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class SomeBeanLayout implements Serializable {

    private final transient VaadinUiScopeBean vaadinUiScopeBean;

    public SomeBeanLayout(VaadinUiScopeBean vaadinUiScopeBean) {
        this.vaadinUiScopeBean = vaadinUiScopeBean;
    }

    @PostConstruct
    public void postInit() {
        System.out.println("Session is " + VaadinSession.getCurrent());
        vaadinUiScopeBean.testMe();
    }
}
