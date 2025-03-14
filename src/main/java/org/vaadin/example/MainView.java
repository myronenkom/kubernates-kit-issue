package org.vaadin.example;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    private final NonSerializableComponentWrapper nonSerializableComponentWrapper;

    public MainView(NonSerializableComponent nonSerializableComponent) {
        this.nonSerializableComponentWrapper = new NonSerializableComponentWrapper(nonSerializableComponent);
        this.add(nonSerializableComponentWrapper);
    }
}
