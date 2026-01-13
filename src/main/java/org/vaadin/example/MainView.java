package org.vaadin.example;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.spreadsheet.CustomSpreadsheet;
import org.vaadin.example.spreadsheet.SpreadsheetWrapper;

@Route
public class MainView extends VerticalLayout {

    public MainView(CustomSpreadsheet customSpreadsheet) {
        var wrapper = new SpreadsheetWrapper(customSpreadsheet);
        wrapper.getElement().getStyle().setHeight("100%");
        wrapper.getElement().getStyle().setWidth("100%");
        this.add(wrapper);
        this.setSizeFull();
    }
}
