package org.vaadin.example.littemplateissue.subtab.content;

import com.vaadin.flow.spring.annotation.SpringComponent;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

@SpringComponent
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SubTab1Content extends SubTab1ContentLayout {
}
