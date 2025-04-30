package org.vaadin.example;

import com.vaadin.flow.spring.annotation.UIScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@UIScope
public class VaadinUiScopeBean implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(VaadinUiScopeBean.class);

    public void reinitialize() {
        log.info("reinitialized");
    }
}
