package design_petterns.classes;

public class User {
    private String name;
    private Integer age;

    User(String name, Integer age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
