package org.vaadin.example;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    private final SomeBeanLayout someBeanLayout;

    public MainView(SomeBeanLayout someBeanLayout) {
        this.add(new Span("qq"));
        this.someBeanLayout = someBeanLayout;
    }
}
