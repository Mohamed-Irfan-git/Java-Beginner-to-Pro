package design_petterns.abstract_factory.concrete_factories;

import design_petterns.abstract_factory.interfaces.Button;
import design_petterns.abstract_factory.interfaces.Check;
import design_petterns.abstract_factory.interfaces.GUIFactory;
import design_petterns.abstract_factory.classes.DarkButton;
import design_petterns.abstract_factory.classes.DarkCheck;

public class DarkThemeFactory implements GUIFactory {
    @Override
    public Check createCheck() {
        return new DarkCheck();

    }

    @Override
    public Button createButton() {
        return new DarkButton();
    }
}
