package com.pattern.creational.abstractFactory;


import com.pattern.creational.abstractFactory.factory.MacOSFactory;
import com.pattern.creational.abstractFactory.factory.WindowsFactory;
import com.pattern.creational.abstractFactory.interfaces.AbstractFactory;

public class Main {
    private static App configureApplication(){
        App app ;
        AbstractFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new App(factory);
        } else {
            factory = new WindowsFactory();
            app = new App(factory);
        }
        return app;
    }
    public static void main(String[] args) {
        App app = configureApplication();
        app.paint();
    }
}
