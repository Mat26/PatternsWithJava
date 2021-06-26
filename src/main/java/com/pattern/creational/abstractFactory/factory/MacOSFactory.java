package com.pattern.creational.abstractFactory.factory;
import com.pattern.creational.abstractFactory.impl.MacOSButton;
import com.pattern.creational.abstractFactory.impl.MacOSCheckbox;
import com.pattern.creational.abstractFactory.interfaces.AbstractFactory;
import com.pattern.creational.abstractFactory.interfaces.Button;
import com.pattern.creational.abstractFactory.interfaces.Checkbox;

public class MacOSFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
