package org.vaadin.example;

import com.vaadin.kubernetes.starter.sessiontracker.UnserializableComponentWrapper;

import java.io.Serializable;

public class NonSerializableComponentWrapper extends UnserializableComponentWrapper<String, NonSerializableComponent> implements Serializable {

    public NonSerializableComponentWrapper(NonSerializableComponent vaadinUiScopeBean) {
        super(vaadinUiScopeBean, NonSerializableComponentWrapper::serialize, NonSerializableComponentWrapper::deserialize);
    }

    static String serialize(NonSerializableComponent bean) {
        // mock up the serialization logic
        return "";
    }

    static NonSerializableComponent deserialize(String data) {
        // Get a new component from the context
        // This line fails because the component requires a bean of vaadin-ui scope as a dependency, but the scope is not active in the thread
        return BeanUtil.getBean(NonSerializableComponent.class);
    }
}
