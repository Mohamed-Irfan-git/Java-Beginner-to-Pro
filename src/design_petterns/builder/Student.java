package design_petterns.builder;

public class Student {
    private final String name;
    private final String surname;
    private final int age;
    private final String gName;
    private final String address;
    private final String FavFood;

    private Student(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.gName = builder.gName;
        this.address = builder.address;
        this.FavFood = builder.FavFood;
    }

    public static class Builder{
        private String name;
        private String surname;
        private int age;
        private String gName;
        private String address;
        private String FavFood;

        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setSurname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder setAge(int age){
            this.age=age;
            return this;
        }
        public Builder setGName(String gName){
            this.gName=gName;
            return this;
        }
        public Builder setAddress(String address){
            this.address=address;
            return this;
        }
        public Builder setFavFood(String FavFood){
            this.FavFood=FavFood;
            return this;
        }
        public Student build(){
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gName='" + gName + '\'' +
                ", address='" + address + '\'' +
                ", FavFood='" + FavFood + '\'' +
                '}';
    }
}
