package basic.inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight box = new BoxWeight(50,30,40,52);
        Box box1 = new Box(box);
        System.out.println(box1.length);
        Box a = new BoxWeight(60,30,60,30);
        System.out.println(a.width);
    }
}
