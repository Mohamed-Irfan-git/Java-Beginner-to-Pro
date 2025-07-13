package design_petterns.abstract_factory.concrete_factories;

import design_petterns.abstract_factory.interfaces.Button;
import design_petterns.abstract_factory.interfaces.Check;
import design_petterns.abstract_factory.interfaces.GUIFactory;
import design_petterns.abstract_factory.classes.LightButton;
import design_petterns.abstract_factory.classes.LightCheck;

public class LightThemeFactory implements GUIFactory {
    @Override
    public Check createCheck() {
        return new LightCheck();
    }

    @Override
    public Button createButton() {
        return new LightButton();
    }
}
