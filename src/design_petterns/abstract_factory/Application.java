package design_petterns.abstract_factory;

import design_petterns.abstract_factory.concrete_factories.DarkThemeFactory;
import design_petterns.abstract_factory.interfaces.Button;
import design_petterns.abstract_factory.interfaces.Check;
import design_petterns.abstract_factory.interfaces.GUIFactory;

public class Application {
    private final Button button;
    private final Check check;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.check = guiFactory.createCheck();

    }

    public void renderUI(){
        button.render();
        check.check();

    }

    public static void main(String[] args) {
        GUIFactory factory = new DarkThemeFactory();
        Application application = new Application(factory);
        application.renderUI();
    }
}
