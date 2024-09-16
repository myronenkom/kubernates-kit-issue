package org.vaadin.example.tesetview;

import com.vaadin.flow.spring.annotation.SpringComponent;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

@SpringComponent
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class TestBeanChild extends TestDesign {

}
