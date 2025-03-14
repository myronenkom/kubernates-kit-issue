package org.vaadin.example;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.stereotype.Component;

@Component
@UIScope
public class VaadinUiScopeBean extends VerticalLayout {

    public void reinitialize() {
        this.add(new Span("UI scope component"));
    }
}
