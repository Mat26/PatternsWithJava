package com.pattern.creational.abstractFactory.factory;
import com.pattern.creational.abstractFactory.impl.WindowsButton;
import com.pattern.creational.abstractFactory.impl.WindowsCheckbox;
import com.pattern.creational.abstractFactory.interfaces.AbstractFactory;
import com.pattern.creational.abstractFactory.interfaces.Button;
import com.pattern.creational.abstractFactory.interfaces.Checkbox;

public class WindowsFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
