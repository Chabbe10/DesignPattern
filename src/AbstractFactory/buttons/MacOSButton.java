package AbstractFactory.buttons;

public class MacOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("Du skapade en MacOS-knapp!");
    }
    
}
