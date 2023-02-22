package AbstractFactory.app;

import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.creatCheckbox();
    }
    
    public void paint(){
        button.paint();
        checkbox.paint();
    }


}
