package org.vaadin.example.spreadsheet;

import com.vaadin.flow.component.spreadsheet.Spreadsheet;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CustomSpreadsheet extends Spreadsheet {

}
