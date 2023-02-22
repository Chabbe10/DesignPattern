package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.buttons.WindowsButton;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new WindowsCheckbox();
    }
    
}
