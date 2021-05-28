package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.webcomponent.WebComponent;
import com.vaadin.flow.function.SerializableBiConsumer;

/**
 * A very simple custom component. When MainView is browsed, the component is used directly;
 * when the {@code index.html} is browsed, the component is instantiated via the
 * {@link MyComponent.Exporter}.
 * @author mavi
 */
public class MyComponent extends VerticalLayout {
    private final Span span = new Span("Hello");

    public MyComponent() {
        add(span);
    }

    public void setGreeting(String greeting) {
        span.setText(greeting);
    }

    public static final class Exporter extends WebComponentExporter<MyComponent> {

        public Exporter() {
            super("my-component");
            addProperty("greeting", "Hello").onChange((SerializableBiConsumer<MyComponent, String>) (myComponent, s) -> myComponent.setGreeting(s));
        }

        @Override
        protected void configureInstance(WebComponent<MyComponent> webComponent, MyComponent component) {
        }
    }
}
