package org.vaadin.example.littemplateissue;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import org.vaadin.example.littemplateissue.subtab.SubTab1Java;
import org.vaadin.example.littemplateissue.subtab.SubTab2Lit;

/**
 * A Designer generated component for the root-2-layout template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("root-2-layout")
@JsModule("./views/root-2-layout.ts")
public class Root2Layout extends LitTemplate {

    @Id("subTab")
    private SubTab1Java subTab;
    @Id("subTab2Lit")
    private SubTab2Lit subTab2Lit;

    /**
     * Creates a new Root2Layout.
     */
    public Root2Layout() {
        // You can initialise any data required for the connected UI components here.
    }

}
