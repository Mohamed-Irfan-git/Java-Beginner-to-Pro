package design_petterns.builder;

public class Main {
    public static void main(String[] args) {

        //this method reduce constructers
        Computer graphic = new Computer.Builder()
                .setCpu("i3")
                .setRam("8GB")
                .setStorage("i3")
                .setHasGraphicCard(true)
                .build();
        System.out.println(graphic);

       Computer office = new Computer.Builder()
               .setCpu("i7")
               .setRam("32GB")
               .setStorage("512GB")
               .build();
        System.out.println(office);



        Student student = new Student.Builder()
                .setName("Irfan")
                .setFavFood("Kottu")
                .build();
        System.out.println(student);
    }
}
