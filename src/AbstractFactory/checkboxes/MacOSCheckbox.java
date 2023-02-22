package AbstractFactory.checkboxes;

public class MacOSCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Du har skapat en MacOs-checkbox!");
    }
    
}
