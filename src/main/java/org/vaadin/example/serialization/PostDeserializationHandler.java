package org.vaadin.example.serialization;

import com.vaadin.kubernetes.starter.sessiontracker.serialization.SpringTransientHandler;
import com.vaadin.kubernetes.starter.sessiontracker.serialization.TransientDescriptor;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class PostDeserializationHandler extends SpringTransientHandler {

    public PostDeserializationHandler(ApplicationContext appCtx) {
        super(appCtx);
    }

    @Override
    public void inject(Object obj, List<TransientDescriptor> transients) {
        super.inject(obj, transients);
        if (obj instanceof PostDeserializationCallback) {
            ((PostDeserializationCallback) obj).postDeserialize();
        }
    }
}
