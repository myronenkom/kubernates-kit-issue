package org.vaadin.example;

import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.spring.annotation.SpringComponent;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.vaadin.example.tesetview.TestBeanChild;

import java.io.Serializable;

@SpringComponent
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class SomeBeanLayout implements Serializable {

    private final transient VaadinUiScopeBean vaadinUiScopeBean;
    private final transient TestBeanChild testView;

    public SomeBeanLayout(VaadinUiScopeBean vaadinUiScopeBean, TestBeanChild testView) {
        this.vaadinUiScopeBean = vaadinUiScopeBean;
        this.testView = testView;
    }

    @PostConstruct
    public void postInit() {
        System.out.println("Session is " + VaadinSession.getCurrent());
        vaadinUiScopeBean.testMe();
    }
}
