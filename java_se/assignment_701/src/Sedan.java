public class Sedan extends Car {
    int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if(length>20){
            return regularPrice-regularPrice*0.05;
        }else{
            return regularPrice-regularPrice*0.1;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "length=" + length +
                ", speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                ", salePrice='" + getSalePrice() + '\'' +
                '}';
    }
}
