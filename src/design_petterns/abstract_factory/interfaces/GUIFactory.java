package design_petterns.abstract_factory.interfaces;

public interface GUIFactory {
    Check createCheck();
    Button createButton();
}
