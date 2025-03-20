package org.vaadin.example;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.Route;
import org.vaadin.example.spreadsheet.CustomSpreadsheet;
import org.vaadin.example.spreadsheet.SpreadsheetWrapper;

@Route
public class MainView extends VerticalLayout {

    public MainView(CustomSpreadsheet customSpreadsheet) {
        TabSheet tabSheet = new TabSheet();
        tabSheet.add("Test Tab", new VerticalLayout());
        tabSheet.add("Test Tab with Spreadsheet", new SpreadsheetWrapper(customSpreadsheet));
        this.add(tabSheet);
    }
}
