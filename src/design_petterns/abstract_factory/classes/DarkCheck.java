package design_petterns.abstract_factory.classes;

import design_petterns.abstract_factory.interfaces.Check;

public class DarkCheck implements Check {
    @Override
    public void check() {
        System.out.println("Checked  Dark Check Box...");

    }
}
