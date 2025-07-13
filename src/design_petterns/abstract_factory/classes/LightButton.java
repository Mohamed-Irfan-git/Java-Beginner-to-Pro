package design_petterns.abstract_factory.classes;

import design_petterns.abstract_factory.interfaces.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering LightButton");
    }
}
