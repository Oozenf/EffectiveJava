package BuilderDesignPattern;

public class Computer {

    // required parameters
    private String CPU;
    private String RAM;

    //optional parameters
    private String graphicCard;
    private boolean isHDMI;

    public Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.graphicCard = builder.graphicCard;
        this.isHDMI = builder.isHDMI;
    }

    public static class Builder {
        // required parameters
        private String CPU;
        private String RAM;

        //optional parameters
        private String graphicCard;
        private boolean isHDMI;

        public Builder(String CPU, String RAM){
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setGraphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public Builder setIsHDMI(boolean isHDMI) {
            this.isHDMI = isHDMI;
            return this;
        }

        public Computer build (){
            return new Computer(this);
        }

    }


    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", isHDMI=" + isHDMI +
                '}';
    }
}
