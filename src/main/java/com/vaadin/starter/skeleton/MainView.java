package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
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
        add(new Span("Using the component from its own Vaadin app"));
        add(new MyComponent());
    }

    @WebServlet(urlPatterns = {"/vaadin/*", "/frontend/*" })
    public static class WebComponentVaadinServlet
            extends VaadinServlet {
    }
}
