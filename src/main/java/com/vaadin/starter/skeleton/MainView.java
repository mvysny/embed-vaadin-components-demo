package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new Span("Using the component directly from the MainView Vaadin route. To see the component used from a static page, navigate to"));
        add(new Anchor("../", "index.html"));
        final MyComponent component = new MyComponent();
        component.setGreeting("Hello from Vaadin app!");
        add(component);
    }

    /**
     * Makes sure the Vaadin Servlet doesn't bind to the `/*` context root, which
     * would capture all requests which would
     * prevent us from navigating to {@code index.html}.
     */
    @WebServlet(urlPatterns = {"/vaadin/*", "/frontend/*" })
    public static class WebComponentVaadinServlet
            extends VaadinServlet {
    }
}
