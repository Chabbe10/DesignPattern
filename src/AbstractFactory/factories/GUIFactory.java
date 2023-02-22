package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox creatCheckbox();
}
