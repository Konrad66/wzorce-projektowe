package structural.wrapper;

public class RegularCar {
    private String brand;
    private double mileage;
    private int speed;

    public RegularCar(String brand, double mileage, int speed) {
        this.brand = brand;
        this.mileage = mileage;
        this.speed = speed;
    }

    public void drive(int hours){
        mileage += hours * speed;
    }

    public String getBrand() {
        return brand;
    }

    public double getMileage() {
        return mileage;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "RegularCar{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", speed=" + speed +
                '}';
    }
}