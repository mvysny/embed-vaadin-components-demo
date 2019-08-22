[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/vaadin-flow/Lobby#?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
[![Build Status](https://travis-ci.org/mvysny/embed-vaadin-components-demo.svg?branch=master)](https://travis-ci.org/mvysny/embed-vaadin-components-demo)

# Embedding Vaadin components into static HTML pages

This app demoes the possibility of exporting a Vaadin Java component
as a Web Component which you can add easily into e.g. your static HTML page.

This is the minimum working example, with the simplest web component possible.

Read the full documentation on this technique at
[Embedding Vaadin Apps](https://vaadin.com/docs/v14/flow/embedding-flow-applications/tutorial-webcomponent-intro.html).

## Importing and running

To access it directly from github, clone the repository and import the project to the IDE of your choice as a Maven project. You need to have Java 8 or 11 installed.

Run using `mvn jetty:run` and open [http://localhost:8080](http://localhost:8080) in the browser.
That opens a static [index.html](src/main/webapp/index.html) page which demoes embedding of the [component](src/main/java/com/vaadin/starter/skeleton/MyComponent.java).
To see the component in a [full-blown Vaadin 14 app](src/main/java/com/vaadin/starter/skeleton/MainView.java), open [http://localhost:8080/vaadin/](http://localhost:8080/vaadin/)

If you want to run your app locally in the production mode, run `mvn jetty:run -Pproduction`.

# Learn Vaadin

This project can be used as a starting point to create your own Vaadin application.
It has the necessary dependencies and files to help you get started.

The best way to use it is via [vaadin.com/start](https://vaadin.com/start) - you can get only the necessary parts and choose the package naming you want to use.
There is also a [getting started tutorial](https://vaadin.com/learn) based on this project.

For a full Vaadin application example, there are more choices available also from [vaadin.com/start](https://vaadin.com/start) page.

