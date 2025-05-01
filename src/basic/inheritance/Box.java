package basic.inheritance;

public class Box {
    int width;
    int length;
    int height;

    public Box() {
        this.width =-1;
        this.length=-1;
        this.height=-1;
    }

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    Box (int side){
        this.width=side;
        this.height=side;
        this.length=side;
    }
    Box(Box old){
        this.width= old.width;;
        this.height= old.height;;
        this.length= old.length;
    }
    public void information(){
        System.out.println("This is an information");
    }
}
