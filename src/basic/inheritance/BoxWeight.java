package basic.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(int width, int length, int height, double weight) {
        super(width, length, height);
        this.weight = weight;
    }

    public BoxWeight(int side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }
}
