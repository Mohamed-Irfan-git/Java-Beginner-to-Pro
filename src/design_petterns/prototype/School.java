package design_petterns.prototype;

public class School implements Prototype {
    private final String name;
    private final String address;

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }


    @Override
    public School clone() {
        return new School(this.name, this.address);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
