package org.vaadin.example.serialization;

import com.vaadin.kubernetes.starter.sessiontracker.serialization.TransientHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SerializationConfig {

    @Bean
    @Primary
    public TransientHandler springDeserializationHandler(ApplicationContext applicationContext)  {
        return new PostDeserializationHandler(applicationContext);
    }
}
