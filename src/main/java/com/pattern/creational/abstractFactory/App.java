package com.pattern.creational.abstractFactory;

import com.pattern.creational.abstractFactory.interfaces.AbstractFactory;
import com.pattern.creational.abstractFactory.interfaces.Button;
import com.pattern.creational.abstractFactory.interfaces.Checkbox;

public class App {
    private Button button;
    private Checkbox checkbox;

    public App(AbstractFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
