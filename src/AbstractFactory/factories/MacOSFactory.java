package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.buttons.MacOSButton;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new MacOSCheckbox();
    }
    
}
