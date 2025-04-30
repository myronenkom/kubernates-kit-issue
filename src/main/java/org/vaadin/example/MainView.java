package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vaadin.example.serialization.PostDeserializationCallback;

@Route
public class MainView extends VerticalLayout implements PostDeserializationCallback {

    private static final Logger logger = LoggerFactory.getLogger(MainView.class);

    private final NonSerializableComponentWrapper nonSerializableComponentWrapper;
    transient private final VaadinUiScopeBean vaadinUiScopeBean;
    transient private final SomeService someService;

    public MainView(NonSerializableComponent nonSerializableComponent, VaadinUiScopeBean vaadinUiScopeBean, SomeService someService) {
        this.nonSerializableComponentWrapper = new NonSerializableComponentWrapper(nonSerializableComponent);
        this.vaadinUiScopeBean = vaadinUiScopeBean;
        this.someService = someService;
        Button button = new Button("Click me");
        button.addClickListener(event -> logger.info(("Listener")));
        this.add(button);
    }

    @Override
    public void postDeserialize() {
        logger.info("postDeserialize");
        vaadinUiScopeBean.reinitialize();
    }
}
