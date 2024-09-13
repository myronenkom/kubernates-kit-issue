package org.vaadin.example;

import com.vaadin.kubernetes.starter.sessiontracker.SessionSerializationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//TODO
@Component
public class SessionSerializationCallbackImpl implements SessionSerializationCallback {

//    private static final Logger log = LoggerFactory.getLogger(SessionSerializationCallbackImpl.class);

    @Override
    public void onSerializationSuccess() {
//        log.debug("Serialization successful");
    }

    @Override
    public void onSerializationError(Exception exception) {
//        log.error("Serialization failed: " + exception.getMessage(), exception);
    }

    @Override
    public void onDeserializationSuccess() {
//        log.debug("Deserialization successful");
    }

    @Override
    public void onDeserializationError(Exception exception) {
//        log.error("Deserialization failed: " + exception.getMessage(), exception);
    }
}
