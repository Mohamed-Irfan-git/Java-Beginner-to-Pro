package design_petterns.abstract_factory.classes;

import design_petterns.abstract_factory.interfaces.Check;

public class LightCheck implements Check {
    @Override
    public void check() {
        System.out.println("Checked light Check Box");

    }
}
