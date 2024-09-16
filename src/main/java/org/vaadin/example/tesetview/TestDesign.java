package org.vaadin.example.tesetview;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.spring.annotation.SpringComponent;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

/**
 * A Designer generated component for the test-design template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("test-design")
@JsModule("./views/test-design.ts")
@SpringComponent
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class TestDesign extends LitTemplate {

    /**
     * Creates a new TestDesign.
     */
    public TestDesign() {
        // You can initialise any data required for the connected UI components here.
    }

}
