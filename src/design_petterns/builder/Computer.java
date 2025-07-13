package design_petterns.builder;

public class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;
    private final boolean hasGraphicCard;

    private Computer(Builder builder) {
        this.cpu=builder.cpu;
        this.ram = builder.ram;
        this.storage=builder.storage;
        this.hasGraphicCard=builder.hasGraphicCard;

    }
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private boolean hasGraphicCard;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setHasGraphicCard(boolean hasGraphicCard) {
            this.hasGraphicCard = hasGraphicCard;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", hasGraphicCard=" + hasGraphicCard +
                '}';
    }
}
