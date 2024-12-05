package org.vaadin.example.littemplateissue.subtab;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.spring.annotation.SpringComponent;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.vaadin.example.littemplateissue.subtab.content.SubTab1Content;

@SpringComponent
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SubTab1Java extends VerticalLayout {

    private final SubTab1Content subTab1Content;

    public SubTab1Java(SubTab1Content subTab1Content) {
        this.subTab1Content = subTab1Content;
    }
}
