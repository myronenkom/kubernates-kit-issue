package org.vaadin.example.serialization;

import com.vaadin.flow.server.VaadinServiceInitListener;
import com.vaadin.kubernetes.starter.SerializationProperties;
import com.vaadin.kubernetes.starter.sessiontracker.serialization.debug.SerializationDebugRequestHandler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@ConditionalOnProperty(name = "vaadin.productionMode", havingValue = "false")
public class DebugToolConfig {

    @Bean
    @Primary
    public VaadinServiceInitListener serializationDebugInitListener(SerializationProperties serializationProperties) {
        return new SerializationDebugRequestHandler.InitListener(serializationProperties);
    }

    @Bean
    @Order(Integer.MIN_VALUE)
    @Primary
    public FilterRegistrationBean<SerializationDebugRequestHandler.Filter> sessionSerializationDebugToolFilter() {
        return new FilterRegistrationBean<>(
                new SerializationDebugRequestHandler.Filter());
    }
}
